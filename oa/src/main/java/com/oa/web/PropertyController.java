package com.oa.web;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Gh_apply;
import com.oa.pojo.Ly_apply;
import com.oa.pojo.Property;
import com.oa.service.Gh_applyService;
import com.oa.service.Ly_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Gh_applyVO;
import com.oa.vo.Ly_applyVO;

/**
 * @author Song
 * @category 库存台账控制器
 */
@Controller
public class PropertyController {

	Logger log = Logger.getLogger(PropertyController.class);

	@Autowired
	private PropertyService propertyservice;

	@Autowired
	private Ly_applyService ly_applyService;

	@Autowired
	private Gh_applyService gh_applyService;

	/**
	 * 查询出当前所有可用资产
	 * 
	 * @return
	 */
	@RequestMapping("/showProperty")
	public @ResponseBody List<Property> showProperty() {
		List<Property> propertys = propertyservice.findAll();
		return propertys;
	}

	/**
	 * 资产采购
	 * 
	 * @param property
	 * @return
	 */
	@RequestMapping("/addProperty")
	public @ResponseBody String addProperty(Property property) {
		Boolean flag = propertyservice.addProperty(property);
		String result = null;
		if (flag) {
			result = "添加成功！";
		} else {
			result = "添加失败！";
		}
		return result;
	}

	/**
	 * 查询出当前所有待审的的领用申请
	 * 
	 * @return
	 */
	@RequestMapping("/showLyapplyToAudit")
	public @ResponseBody List<Ly_applyVO> showLyapplyToAudit() {
		List<Ly_applyVO> ly_applyVOs = ly_applyService.findByState(1);
		return ly_applyVOs;
	}

	/**
	 * 提交领用申请
	 * 
	 * @param ly_apply
	 * @return
	 */
	@RequestMapping("/addLyapply")
	public @ResponseBody String addLyapply(Ly_apply ly_apply) {
		ly_apply.setApdate(new Date(System.currentTimeMillis()));
		ly_apply.setSta_id(1);
		boolean flag = ly_applyService.addLy_apply(ly_apply);
		String result = null;
		if (flag) {
			result = "提交成功！";
		} else {
			result = "提交失败！";
		}
		return result;
	}

	/**
	 * 审核领用申请
	 * 
	 * @param apid
	 * @param sta_id
	 * @return
	 */
	@RequestMapping("/auditLyapply")
	public @ResponseBody String auditLyapply(Integer apid, Integer sta_id) {
		boolean flag = ly_applyService.changeState(apid, sta_id);
		String result = null;
		if (flag) {
			result = "审核通过！";
		} else {
			result = "提交失败！";
		}
		return result;
	}

	/**
	 * 查询出所有待审核的的归还申请
	 * 
	 * @return
	 */
	@RequestMapping("/showGhapplyToAudit")
	public @ResponseBody List<Gh_applyVO> showGhapplyToAudit() {
		List<Gh_applyVO> gh_applyVOs = gh_applyService.findByState(1);
		return gh_applyVOs;
	}

	/**
	 * 提交归还申请
	 * 
	 * @param ly_apply
	 * @return
	 */
	@RequestMapping("/addGhapply")
	public @ResponseBody String addGhapply(Gh_apply gh_apply) {
		gh_apply.setGhdatetime(new Date(System.currentTimeMillis()));
		gh_apply.setSid(1);
		boolean flag = gh_applyService.addGh_apply(gh_apply);
		String result = null;
		if (flag) {
			result = "提交成功！";
		} else {
			result = "提交失败！";
		}
		return result;
	}

	/**
	 * 审核归还申请
	 * 
	 * @param apid
	 * @param sta_id
	 * @return
	 */
	@RequestMapping("/auditGhapply")
	public @ResponseBody String auditGhapply(Integer id, Integer sid) {
		boolean flag = gh_applyService.changeState(id, sid);
		String result = null;
		if (flag) {
			result = "审核通过！";
		} else {
			result = "提交失败！";
		}
		return result;
	}

	/**
	 * 查询出所有的已经被审核的领用申请
	 * 
	 * @return
	 */
	@RequestMapping("/showLyapplyAudited")
	public @ResponseBody List<Ly_applyVO> showLyapplyAudited() {
		List<Ly_applyVO> ly_applyVOs = ly_applyService.findByState(2);
		List<Ly_applyVO> ly_applyVOs2 = ly_applyService.findByState(3);
		List<Ly_applyVO> ly_applyVOs3 = new ArrayList<Ly_applyVO>();
		for (Ly_applyVO ly_applyVO : ly_applyVOs) {
			ly_applyVOs3.add(ly_applyVO);
		}
		for (Ly_applyVO ly_applyVO : ly_applyVOs2) {
			ly_applyVOs3.add(ly_applyVO);
		}
		return ly_applyVOs3;
	}

	/**
	 * 查询出所有的已经被审核的归还申请
	 * 
	 * @return
	 */
	@RequestMapping("/showGhapplyAudited")
	public @ResponseBody List<Gh_applyVO> showGhapplyAudited() {
		List<Gh_applyVO> gh_applyVOs = gh_applyService.findByState(2);
		List<Gh_applyVO> gh_applyVOs2 = gh_applyService.findByState(3);
		List<Gh_applyVO> gh_applyVOs3 = new ArrayList<Gh_applyVO>();
		for (Gh_applyVO gh_applyVO : gh_applyVOs) {
			gh_applyVOs3.add(gh_applyVO);
		}
		for (Gh_applyVO gh_applyVO : gh_applyVOs2) {
			gh_applyVOs3.add(gh_applyVO);
		}
		return gh_applyVOs3;
	}

	/**
	 * 资产审核通过
	 * 
	 * @param iid
	 * @param inumber
	 * @return
	 */
	@RequestMapping("/lyProperty")
	public @ResponseBody String lyProperty(Integer iid, Integer inumber) {
		boolean flag = propertyservice.updateNumber(iid, 0 - inumber);
		String result = null;
		if (flag) {
			result = "领用成功！";
		} else {
			result = "领用失败！";
		}
		return result;
	}

	/**
	 * 资产归还审核通过
	 * 
	 * @param iid
	 * @param inumber
	 * @return
	 */
	@RequestMapping("/ghProperty")
	public @ResponseBody String ghProperty(Integer iid, Integer inumber) {
		boolean flag = propertyservice.updateNumber(iid, inumber);
		String result = null;
		if (flag) {
			result = "领用成功！";
		} else {
			result = "领用失败！";
		}
		return result;
	}
}
