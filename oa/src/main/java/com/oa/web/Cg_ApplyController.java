package com.oa.web;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Cg_Apply;
import com.oa.pojo.Property;
import com.oa.service.Cg_ApplyService;
import com.oa.service.PropertyService;
import com.oa.vo.Cg_ApplyVO;

/**
 * @author song
 * @category 资产采购申请控制器
 *
 */
@Controller
@RequestMapping("/caigou")
public class Cg_ApplyController {
	Logger log = Logger.getLogger(Cg_ApplyController.class);
	@Resource
	private Cg_ApplyService cg_ApplyService;
	@Resource
	private PropertyService propertyService;

	// 查询所有资产采购申请信息(已完成)
	@RequestMapping("/Cg_list")
	public @ResponseBody List<Cg_ApplyVO> Cg_list() {
		List<Cg_ApplyVO> cg_ApplyVOs = cg_ApplyService.findAll();
		return cg_ApplyVOs;
	}

	// 根据采购编号查询采购申请信息(已完成)
	@RequestMapping("/cg_Apply")
	public @ResponseBody Cg_ApplyVO cg_Apply(int pid) {
		Cg_ApplyVO cApply = cg_ApplyService.findById(pid);
		return cApply;
	}

	// 根据库存编号查询采购申请信息(已完成)
	@RequestMapping("/cg_cApply")
	public @ResponseBody List<Cg_ApplyVO> cg_cApply(Integer iid) {
		List<Cg_ApplyVO> cg_Apply = cg_ApplyService.findByCg_ApplyId(iid);
		return cg_Apply;

	}

	// 增加一个资产采购申请表(已完成)
	@RequestMapping("/cg_ApplyAdd")
	public @ResponseBody String cg_ApplyAdd(@ModelAttribute("Cg_Apply") Cg_Apply cg_Apply) {
		System.out.println(cg_Apply.getC_number());
		System.out.println(cg_Apply.getPdate());
		return "redirect:Cg_list.action";
	}

	// 根据员工id删除员工资产采购申请信息(已完成)
	@RequestMapping("/delete_Cg_Apply")
	public String delete_Cg_Apply(Integer iid) {
		cg_ApplyService.delete(iid);
		return "redirect:Cg_list.action";

	}

	// 根据员工id删除员工资产采购申请信息(已完成)
	@RequestMapping("/delete_EmpApply")
	public String delete_EmpApply(Integer uid) {
		cg_ApplyService.deleteEmp(uid);
		return "redirect:Cg_list.action";
	}

	// 更新资产采购申请信息(已完成)
	@RequestMapping("/update_Cg_Apply")
	public String update_Cg_Apply(Integer pid, Integer sta_id) {
		Cg_ApplyVO cg_ApplyVO = cg_ApplyService.findById(pid);
		cg_ApplyVO.setSta_id(sta_id);// 更改审核状态（同意：sta_id=2；不同意：sta_id=3）
		cg_ApplyService.update(cg_ApplyVO);
		if (sta_id == 2) {
			int iid = cg_ApplyVO.getIid();
			Property property = propertyService.findById(iid);
			int a = property.getInumber();
			int i = cg_ApplyVO.getC_number();
			property.setInumber(a + i);
			System.out.println(propertyService.update(property));
			return "redirect:Cg_list.action";
		} else {
			return "redirect:404.action";
		}

	}

}
