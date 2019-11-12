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
@RequestMapping("/buMen")
public class DepartmentContorller {

	Logger log = Logger.getLogger(DepartmentContorller.class);

	@Resource
	private DepartmentService departmentService;

	/**
	 * @return 查询所有部门对象
	 */
	@RequestMapping("/list")
	public @ResponseBody List<Department> blist() {
		List<Department> blist = departmentService.findAll();
		return blist;

	}

	/**
	 * @param id
	 *            部门编号
	 * @return 根据部门编号查询部门对象
	 */
	@RequestMapping("/findBId")
	public @ResponseBody Department findBId(int id) {
		Department department = departmentService.findById(id);
		return department;

	}

}
