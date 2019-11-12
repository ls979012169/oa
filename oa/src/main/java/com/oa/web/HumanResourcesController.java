package com.oa.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Employee;
import com.oa.service.EmployeeService;
import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 人力资源控制器
 */

@Controller
public class HumanResourcesController {

	@Autowired
	private EmployeeService employeeService;

	/**
	 * 查询所有员工的人事档案
	 * 
	 * @return List<EmployeeVO> 所有员工的信息
	 */
	@RequestMapping("/showPersonnelFiles")
	public @ResponseBody List<EmployeeVO> showPersonnelFiles() {
		List<EmployeeVO> employeeVOs = employeeService.findUserList();
		return employeeVOs;
	}

	/**
	 * 查询出当前要修改信息的员工
	 * 
	 * @param eid
	 * @return
	 */
	@RequestMapping("/toUpdateEmployee")
	public @ResponseBody EmployeeVO toUpdateEmployee(Integer eid) {
		EmployeeVO employeeVO = employeeService.findById(eid);
		return employeeVO;
	}

	/**
	 * 更该员工信息
	 * 
	 * @param employee
	 * @return
	 */
	@RequestMapping("/updateEmployee")
	public @ResponseBody String updateEmployee(Employee employee) {
		Employee newEmployee = employeeService.find(employee.getEid());
		Boolean flag = employeeService.update(newEmployee);
		String result = null;
		if (flag) {
			result = "更新成功！";
		} else {
			result = "更新失败！";
		}
		return result;
	}

	/**
	 * 添加员工
	 * 
	 * @param employee
	 * @return
	 */
	@RequestMapping("/addEmployee")
	public @ResponseBody String addEmployee(Employee employee) {
		Boolean flag = employeeService.add(employee);
		String result = null;
		if (flag) {
			result = "添加成功！";
		} else {
			result = "添加失败！";
		}
		return result;
	}

	/**
	 * 删除员工
	 * 
	 * @param eid
	 * @return
	 */
	@RequestMapping("/deleteEmployee")
	public @ResponseBody String deleteEmployee(Integer eid) {
		Boolean flag = employeeService.delete(eid);
		String result = null;
		if (flag) {
			result = "删除成功！";
		} else {
			result = "删除失败！";
		}
		return result;
	}

}
