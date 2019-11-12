package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.service.Ly_applyService;
import com.oa.vo.Ly_applyVO;

/**
 * @author TREX
 * @category 资产领用控制器
 */
@Controller
public class Ly_applyController {
/*
<<<<<<< .mine
	@Resource
=======
	Logger log = Logger.getLogger(Ly_applyController.class);
	
	@Resource
>>>>>>> .r5242
	private Ly_applyService ly_applyService;
	
	//根据资产领用申请表状态查询表
	@RequestMapping("/Ly_findByState")
	public @ResponseBody List<Ly_applyVO> findByState(int sta_id){
		List<Ly_applyVO> ly_applyState=ly_applyService.findByState(sta_id);
		return ly_applyState;
	}
	
	//查询所有资产领用申请表
	@RequestMapping("/Ly_findAll")
	public @ResponseBody List<Ly_applyVO> findAll(){
		List<Ly_applyVO> ly_applyState = ly_applyService.findAll();
		return ly_applyState;
	}
	
	//根据资产领用申请表编号查询表
	@RequestMapping("/Ly_findById")
	public @ResponseBody Ly_applyVO findById(int apid){
		Ly_applyVO ly_applyVO = ly_applyService.findById(apid);
		return ly_applyVO;
		
	}*/
}
