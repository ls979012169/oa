package com.oa.web;



import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.oa.pojo.Department;
import com.oa.service.DepartmentService;

/**
 * @author Administrator
 * @category 部门控制器
 */
@Controller
public class DepartmentContorller {

	Logger log = Logger.getLogger(DepartmentContorller.class);
	
	@Resource
	private DepartmentService departmentService; 
	
	//查询所有部门对象
	@RequestMapping("/b_list")
	public @ResponseBody List<Department> blist() {
		log.debug("blist...");
		List<Department> blist = departmentService.findAll();
		log.debug("斯蒂芬告诉对方公司的风格" + blist.size());
		// modle.addAttribute("list", list);
		return blist;

	}
	
	//根据部门id查询部门对象
	@RequestMapping("/b_findBId")
	public @ResponseBody Department findBId(int id) {
		log.debug("findBId...");
		Department department = departmentService.findById(id);
		return department;

	}
	
}
















