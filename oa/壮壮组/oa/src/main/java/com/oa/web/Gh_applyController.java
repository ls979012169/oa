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
public class Gh_applyController {
	
	Logger log = Logger.getLogger(Gh_applyController.class);

	@Resource
	private Ly_applyService Ly_applyService;
	
	@Resource
	private Gh_applyService Gh_applyService;
	
	//根据资产归还申请表编号查询表
	@RequestMapping("/Gh_findById")
	public @ResponseBody Ly_applyVO findById(int id){
		Ly_applyVO gh_applyList= Ly_applyService.findById(id);
		return gh_applyList;
	}
	
	//根据资产归还申请表状态查询表
	@RequestMapping("/Gh_findBystate")
	public @ResponseBody List<Ly_applyVO> findByState(int sid){
		List<Ly_applyVO> gh_applyState=Ly_applyService.findByState(sid);
		return gh_applyState;
	}
	
	//查询所有资产归还申请表
	@RequestMapping("/Gh_findAll")
	public @ResponseBody List<Ly_applyVO> findAll(){
		log.debug("Gh_findAll...");
		List<Ly_applyVO> gh_applyState = Ly_applyService.findAll();
		
		return gh_applyState;
		
	}
}
