package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Ly_apply;
import com.oa.pojo.Property;
import com.oa.service.Ly_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Ly_applyVO;

/**
 * @author TREX
 * @category 资产领用控制器
 */
@Controller
@RequestMapping("/lingyong")
public class Ly_applyController {

	Logger log = Logger.getLogger(Ly_applyController.class);
	@Resource
	private Ly_applyService ly_applyService;
	@Resource
	private PropertyService propertyService;

	/**
	 * 根据资产领用申请表状态编号查询表
	 * 
	 * @param sta_id
	 *            申请表状态编号
	 * @return
	 */
	@RequestMapping("/Ly_findByState")
	public @ResponseBody List<Ly_applyVO> findByState(int sta_id) {
		List<Ly_applyVO> ly_applyState = ly_applyService.findByState(sta_id);
		return ly_applyState;
	}

	/**
	 * 查询所有资产领用申请表
	 * 
	 * @return
	 */
	@RequestMapping("/Ly_findAll")
	public @ResponseBody List<Ly_applyVO> findAll() {
		List<Ly_applyVO> ly_applyState = ly_applyService.findAll();
		return ly_applyState;
	}

	/**
	 * 根据资产领用申请表编号查询表
	 * 
	 * @param apid
	 *            申请表编号
	 * @return
	 */
	@RequestMapping("/Ly_findById")
	public @ResponseBody Ly_applyVO findById(int apid) {
		Ly_applyVO ly_applyVO = ly_applyService.findById(apid);
		return ly_applyVO;
	}

	/**
	 * 根据资产领用状态更新一条资产领用信息
	 * 
	 * @param apid
	 *            领用申请编号
	 * @param sta_id
	 *            审核状态编号
	 * @return
	 */
	@RequestMapping("/update")
	public String update(int apid, int sta_id) {
		Ly_applyVO ly_apply = ly_applyService.findById(apid);
		ly_apply.setSta_id(sta_id);// 更改审核状态（同意：sta_id=2；不同意：sta_id=3）
		ly_applyService.update(ly_apply);
		if (sta_id == 2) {
			int iid = ly_apply.getIid();
			Property property = propertyService.findById(iid);
			int inumber = property.getInumber();
			int i = ly_apply.getApnumber();
			if (inumber >= i) {
				property.setInumber(inumber - i);
				propertyService.update(property);
				return "redirect:Ly_findAll.action";
			} else {
				return "redirect:404.action";
			}
		} else {
			return "redirect:404.action";
		}

	}

	/**
	 * 根据领用申请编号，删除一条领用申请
	 * 
	 * @param apid
	 * @return
	 */
	@RequestMapping("/delete")
	public String delete(int apid) {
		ly_applyService.delLy_apply(apid);
		return "redirect:Ly_findAll.action";
	}

	/**
	 * 增加一条领用申请对象
	 * 
	 * @param apply
	 * @return
	 */
	@RequestMapping("add")
	public String add(Ly_apply apply) {
		ly_applyService.addLy_apply(apply);
		return "redirect:Ly_findAll.action";
	}
}
