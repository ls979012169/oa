package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Property;
import com.oa.service.Gh_applyService;
import com.oa.service.Ly_applyService;
import com.oa.service.PropertyService;
import com.oa.vo.Gh_applyVO;
import com.oa.vo.Ly_applyVO;

@Controller
@RequestMapping("/guihuan")
public class Gh_applyController {

	Logger log = Logger.getLogger(Gh_applyController.class);

	@Resource
	private Ly_applyService Ly_applyService;
	@Resource
    private PropertyService propertyService;
	@Resource
	private Gh_applyService Gh_applyService;

	// 根据资产归还申请表编号查询表
	@RequestMapping("/Gh_findById")
	public @ResponseBody Ly_applyVO findById(int id) {
		Ly_applyVO gh_applyList = Ly_applyService.findById(id);
		return gh_applyList;
	}

	// 根据资产归还申请表状态查询表
	@RequestMapping("/Gh_findBystate")
	public @ResponseBody List<Ly_applyVO> findByState(int sid) {
		List<Ly_applyVO> gh_applyState = Ly_applyService.findByState(sid);
		return gh_applyState;
	}

	// 查询所有资产归还申请表
	@RequestMapping("/Gh_findAll")
	public @ResponseBody List<Ly_applyVO> findAll() {
		log.debug("Gh_findAll...");
		List<Ly_applyVO> gh_applyState = Ly_applyService.findAll();
		return gh_applyState;
	}
	
	//根据资产归还状态更新一条资产领用信息
	@RequestMapping("/update")
	public String update(int id, int sid){
		Gh_applyVO gh_apply = Gh_applyService.findById(id);
		gh_apply.setSid(sid);//更改审核状态（同意：sid=2；不同意：sid=3）
		Gh_applyService.update(gh_apply);
		if(sid==2){
			Ly_applyVO ly_apply = Ly_applyService.findById(gh_apply.getApid());
			int iid = ly_apply.getIid();
			int a = ly_apply.getApnumber();
			Property property = propertyService.findById(iid);
			int b = property.getInumber();
			property.setInumber(a+b);
			System.out.println(propertyService.update(property));
			return "redirect:Gh_findAll.action";
		}else{
			return "redirect:404.action";
		}
		
	}
}

























