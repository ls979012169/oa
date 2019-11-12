package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Cg_Apply;
import com.oa.pojo.Daily;
import com.oa.service.Cg_ApplyService;
import com.oa.vo.Cg_ApplyVO;

/**
 * @author song
 * @category 资产采购申请控制器
 *
 */
@Controller
public class Cg_ApplyController {
	Logger log = Logger.getLogger(Cg_ApplyController.class);
	@Resource
	private Cg_ApplyService cg_ApplyService;

	// 查询所有资产采购申请信息
	@RequestMapping("/Cg_list")
	public @ResponseBody List<Cg_ApplyVO> Cg_list() {
		List<Cg_ApplyVO> cg_ApplyVOs = cg_ApplyService.findAll();
		return cg_ApplyVOs;
	}

	// 根据采购编号查询采购申请信息
	@RequestMapping("/cg_Apply")
	public @ResponseBody Cg_Apply cg_Apply(int pid) {
		Cg_Apply cApply = cg_ApplyService.findById(pid);
		return cApply;

	}

	// 根据库存编号查询采购申请信息
	@RequestMapping("/cg_cApply")
	public @ResponseBody Cg_Apply cg_cApply(int iid) {
		Cg_Apply cg_Apply = cg_ApplyService.findByCg_ApplyId(iid);
		return cg_Apply;

	}

	// 增加一个资产采购申请表
	@RequestMapping("/cg_ApplyAdd")
	public @ResponseBody String cg_ApplyAdd(@ModelAttribute("Cg_Apply") Cg_Apply cg_Apply) {
		System.out.println(cg_Apply.getC_number());
		System.out.println(cg_Apply.getPdate());
		return "redirect:Cg_list.action";
	}

	// 根据员工id删除员工资产采购申请信息
	@RequestMapping("/delete_Cg_Apply")
	public String delete_Cg_Apply(Integer iid) {
		cg_ApplyService.delete(iid);
		return "redirect:Cg_list.action";

	}

	// 根据员工id删除员工资产采购申请信息
	@RequestMapping("/delete_EmpApply")
	public String delete_EmpApply(Integer uid) {
		cg_ApplyService.deleteEmp(uid);
		return "redirect:Cg_list.action";
	}

	// 更新资产采购申请信息
	public String update_Cg_Apply(Integer pid,int sta_id) {
		Cg_Apply cg_Apply = cg_ApplyService.findById(pid);
		cg_Apply.setSta_id(sta_id);
		cg_ApplyService.update(cg_Apply);
		return "redirect:Cg_list.action";

	}

}
