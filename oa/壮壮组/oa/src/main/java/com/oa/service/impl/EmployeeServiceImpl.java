package com.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.PositionDao;
import com.oa.pojo.Daily;
import com.oa.pojo.Employee;
import com.oa.service.DailyService;
import com.oa.service.EmployeeService;
import com.oa.service.Ly_applyService;
import com.oa.service.TaskService;
import com.oa.vo.DailyVO;
import com.oa.vo.EmployeeVO;
import com.oa.vo.TaskVO;

/**
 * @author Song
 * @category 员工业务逻辑实现类
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private PositionDao positionDao;

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired
	private TaskService taskService;

	@Autowired
	private DailyService dailySerivce;

	@Autowired
	private Ly_applyService ly_applyService;

	private EmployeeVO change(Employee employee) {
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setEid(employee.getEid());
		employeeVO.setEname(employee.getEname());
		employeeVO.setPassword(employee.getPassword());
		employeeVO.setSex(employee.getSex());
		employeeVO.setZid(employee.getZid());
		employeeVO.setBid(employee.getBid());
		employeeVO.setTel(employee.getTel());
		employeeVO.setDate(employee.getDate());
		employeeVO.setPname(positionDao.findById(employee.getZid()).getPname());
		employeeVO.setDname(departmentDao.findById(employee.getBid()).getDname());
		return employeeVO;
	}

	private List<EmployeeVO> changeList(List<Employee> employees) {
		List<EmployeeVO> employeeVOs = new ArrayList<EmployeeVO>();
		for (Employee employee : employees) {
			employeeVOs.add(change(employee));
		}
		return employeeVOs;
	}

	@Override
	public EmployeeVO find(String ename, String password) {
		return change(employeeDao.find(ename, password));
	}

	@Override
	public boolean add(Employee employee) {
		return employeeDao.add(employee) > 0 ? true : false;
	}

	@Override
	public boolean delete(int eid) {
		Boolean flag = true;
		// 删除该员工所有的个人任务
		List<TaskVO> taskVOs = taskService.findByEid(eid);
		for (TaskVO taskVO : taskVOs) {
			if (!taskService.delete(taskVO.getTid())) {
				flag = false;
			}
		}
		// 删除该员工所有的个人日报
		List<DailyVO> dailies = dailySerivce.findById(eid);
		if (!dailySerivce.delete(eid)) {
			flag = false;
		}
		// 删除该员工所有的考勤信息

		// 删除该员工所有上传的文件

		// 删除该员工所有的报销表

		// 删除该员工所有的资产领用申请表

		if (flag == false) {
			return false;
		} else {
			return employeeDao.delete(eid) > 0 ? true : false;
		}

	}

	@Override
	public boolean update(Employee employee) {
		return employeeDao.update(employee) > 0 ? true : false;
	}

	@Override
	public EmployeeVO findById(int eid) {
		return change(employeeDao.findById(eid));
	}

	@Override
	public EmployeeVO findByUserName(String ename) {
		return change(employeeDao.findByUserName(ename));
	}

	@Override
	public List<EmployeeVO> findUserList() {
		return changeList(employeeDao.findUserList());
	}

	@Override
	public EmployeeVO findByPid(int zid) {
		return change(employeeDao.findByPid(zid));
	}

	@Override
	public List<EmployeeVO> findByDid(int bid) {
		return changeList(employeeDao.findByDid(bid));
	}

	@Override
	public Employee find(int eid) {
		return employeeDao.findById(eid);
	}
}
