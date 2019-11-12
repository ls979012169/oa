package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Daily;
import com.oa.service.DailyService;
import com.oa.vo.DailyVO;

/**
 * @author song
 * @category 个人日报控制器
 *
 */
@Controller
@RequestMapping("/riZhi")
public class DailyController {
	Logger log = Logger.getLogger(DailyController.class);
	@Resource
	private DailyService dailyService;

	/**
	 * @return 查询所有日报
	 */
	@RequestMapping("/list")
	public @ResponseBody List<DailyVO> list() {
		List<DailyVO> Dailylist = dailyService.findAll();
		return Dailylist;
	}

	/**
	 * @param daily
	 *            增加一个日报信息
	 * @return 重定向到查询所有日志信息控制器
	 */
	@RequestMapping("/addSave")
	public @ResponseBody String addSave(@ModelAttribute("daily") Daily daily) {
		dailyService.add(daily);
		return "redirect:list.action";

	}

	/**
	 * @param id
	 *            部门编号
	 * @return 根据部门编号查询所有日报信息
	 */
	@RequestMapping("/listDaily")
	public @ResponseBody List<DailyVO> listDaily(int id) {
		List<DailyVO> dailyVOs = dailyService.findByDepId(id);
		return dailyVOs;

	}

	/**
	 * @param date
	 *            日期（格式为“yyyy-MM-dd”）
	 * @return 根据日期查询当日所有日报信息
	 */
	@RequestMapping("/listDailyVO")
	public @ResponseBody List<DailyVO> listDailyVO(String date) {
		List<DailyVO> dListVO = dailyService.findByListDate(date);
		return dListVO;

	}

	/**
	 * @param date
	 *            日期（格式为“yyyy-MM-dd”）
	 * @param eid
	 *            员工编号
	 * @return 根据日期和员工编号查询自己的日报信息
	 */
	@RequestMapping("/dailyVO")
	public @ResponseBody List<DailyVO> dailyVO(String date, Integer eid) {
		List<DailyVO> dVos = dailyService.findDateOne(date, eid);
		return dVos;

	}

	/**
	 * @param eid
	 *            员工编号
	 * @return 根据员工编号查询日报信息
	 */
	@RequestMapping("/listDailydd")
	public @ResponseBody List<DailyVO> listDailydd(Integer eid) {
		List<DailyVO> dailies = dailyService.findById(eid);
		return dailies;

	}

	/**
	 * 
	 * @param did
	 *            日报编号
	 * @return 根据日报编号查询日报信息
	 */
	@RequestMapping("/dailyRB")
	public @ResponseBody DailyVO dailyRB(int did) {
		DailyVO dailyVO = dailyService.findByDailyId(did);
		return dailyVO;
	}

	/**
	 * 根据日报编号删除日报信息
	 * 
	 * @param did
	 *            日报编号
	 * @return 重定向到查询所有日报控制器
	 */
	@RequestMapping("/deleteDaily")
	public String deleteDaily(Integer did) {
		dailyService.deleteById(did);
		return "redirect:list.action";
	}

	/**
	 * 更新一个日报对象
	 * 
	 * @param did
	 *            日报编号
	 * @param wdef
	 *            日报内容
	 * @return 重定向到查询所有日报控制器
	 */
	@RequestMapping("/updateDaily")
	public String updateDaily(Integer did, String wdef) {
		DailyVO dailyVO = dailyService.findByDailyId(did);
		dailyVO.setWdef(wdef);
		dailyService.update(dailyVO);
		return "redirect:list.action";

	}

}
