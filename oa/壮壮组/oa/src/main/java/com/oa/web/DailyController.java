package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class DailyController {
	Logger log = Logger.getLogger(DailyController.class);
	@Resource
	private DailyService dailyService;

	// 查询所有日报
	@RequestMapping("/list")
	public @ResponseBody List<DailyVO> list(Model model) {
		List<DailyVO> Dailylist = dailyService.findAll();
		return Dailylist;
	}

	// 增加一个日报信息
	@RequestMapping("/addSave")
	public @ResponseBody String addSave(@ModelAttribute("daily") Daily daily) {
		System.out.println(daily.getWdef());
		System.out.println(daily.getWdate());
		return "redirect:list.action";

	}

	// 根据部门id查询所有日报信息
	@RequestMapping("/listDaily")
	public @ResponseBody List<DailyVO> listDaily(int id) {
		List<DailyVO> dailyVOs = dailyService.findByDepId(id);
		return dailyVOs;

	}

	// 根据日期查询当日所有日报信息
	@RequestMapping("/listDailyVO")
	public @ResponseBody List<DailyVO> listDailyVO(String date) {
		List<DailyVO> dListVO = dailyService.findByListDate(date);
		return dListVO;

	}

	// 根据日期和员工id查询自己的日报信息
	@RequestMapping("/dailyVO")
	public @ResponseBody List<DailyVO> dailyVO(String date, Integer eid) {
		List<DailyVO> dVos = dailyService.findDateOne(date, eid);
		return dVos;

	}

	// 根据员工eid查询日报信息
	@RequestMapping("/listDailydd")
	public @ResponseBody List<DailyVO> listDailydd(Integer eid) {
		List<DailyVO> dailies = dailyService.findById(eid);
		return dailies;

	}

	// 根据日报id查询日报信息
	@RequestMapping("/dailyRB")
	public @ResponseBody Daily dailyRB(int did) {
		Daily dailyrb = dailyService.findByDailyId(did);
		return dailyrb;

	}

	// 根据员工id删除日报信息
	@RequestMapping("/deleteDaily")
	public String deleteDaily(Integer eid) {
		dailyService.delete(eid);
		return "redirect:list.action";
	}

	// 更新日报信息
	@RequestMapping("/updateDaily")
	public String updateDaily(Integer eid, String wdef) {
		Daily daily = (Daily) dailyService.findById(eid);
		daily.setWdef(wdef);
		dailyService.update(daily);
		return "redirect:list.action";

	}

}
