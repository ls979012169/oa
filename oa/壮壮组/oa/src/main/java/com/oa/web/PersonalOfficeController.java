package com.oa.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oa.pojo.Daily;
import com.oa.pojo.Department;
import com.oa.pojo.Employee;
import com.oa.pojo.Task;
import com.oa.service.DailyService;
import com.oa.service.DepartmentService;
import com.oa.service.EmployeeService;
import com.oa.service.PositionService;
import com.oa.service.TaskService;
import com.oa.vo.DailyVO;
import com.oa.vo.EmployeeVO;
import com.oa.vo.TaskVO;

/**
 * @author xxl
 * @category 个人办公控制器
 */

@Controller
public class PersonalOfficeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private DailyService dailyService;

	/**
	 * 个人日报：创建个人日报
	 * 
	 * @return 创建结果（是否创建成功）
	 */
	@RequestMapping("/createPersonalJournal")
	public @ResponseBody String createPersonalJournal(Daily daily, HttpSession session) {
		String result = null;
		// 从session中获取当前登录员工的信息
		EmployeeVO employeeVO = (EmployeeVO) session.getAttribute("employeeVO");
		daily.setEid(employeeVO.getEid());
		Boolean flag = dailyService.add(daily);
		if (flag) {
			result = "创建成功！";
		} else {
			result = "创建失败！";
		}
		return result;
	}

	/**
	 * 个人日报：展示个人日报，如果当前登录员工为普通员工，则能看到自己今天的个人日报，若为经理则能看到本部门所有员工的个人日报
	 * 
	 * @return List<Daily> 个人日报
	 */
	@RequestMapping("/showPersonalJournal")
	public @ResponseBody List<DailyVO> showPersonalJournal(String date, HttpSession session) {
		// java.sql.Date time = new java.sql.Date(new
		// java.util.Date().getTime());
		String today = new SimpleDateFormat("yy-MM-dd").format(new Date());
		Employee employee = (Employee) session.getAttribute("employeeVO");
		int bid = employee.getBid();
		if (employee.getZid() == 1) {
			List<DailyVO> dailys = dailyService.findByDepId(bid);
			return dailys;
		} else {
			List<DailyVO> dailys = dailyService.findDateOne(today, employee.getEid());
			return dailys;
		}
	}

	/**
	 * 任务管理:当前登录用户为经理时可以看到该页面
	 * 
	 * @return List<Task> 本部门所有人的任务
	 */
@RequestMapping("/taskManager")
	public @ResponseBody List<TaskVO> taskManager(Integer bid) {
		List<TaskVO> taskVOs = taskService.findByBid(bid);
		return taskVOs;
	}

	/**
	 * 通讯录
	 * 
	 * @param id
	 *            部门编号
	 * @return List<EmployeeVO> 本部门的所有员工
	 */
	@RequestMapping("/addressBook")
	public @ResponseBody List<EmployeeVO> addressBook(Integer id) {
		List<EmployeeVO> list = employeeService.findByDid(id);
		return list;
	}

}
