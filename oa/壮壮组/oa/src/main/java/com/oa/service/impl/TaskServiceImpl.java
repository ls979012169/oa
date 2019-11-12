package com.oa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DepartmentDao;
import com.oa.dao.EmployeeDao;
import com.oa.dao.PositionDao;
import com.oa.dao.TaskDao;
import com.oa.pojo.Employee;
import com.oa.pojo.Task;
import com.oa.service.TaskService;
import com.oa.vo.EmployeeVO;
import com.oa.vo.TaskVO;

/**
 * @author xxl
 * @category 任务业务扩及实现层
 */

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private DepartmentDao departmentDao;

	@Autowired
	private PositionDao positionDao;

	private EmployeeVO changeEmp(Employee employee) {
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

	private List<EmployeeVO> changeEmpList(List<Employee> employees) {
		List<EmployeeVO> employeeVOs = new ArrayList<EmployeeVO>();
		for (Employee employee : employees) {
			employeeVOs.add(changeEmp(employee));
		}
		return employeeVOs;
	}

	private TaskVO change(Task task) {
		TaskVO taskVO = new TaskVO();
		taskVO.setTid(task.getTid());
		taskVO.setEid(task.getEid());
		taskVO.setTdef(task.getTdef());
		taskVO.setSdate(task.getSdate());
		taskVO.setEdate(task.getEdate());
		taskVO.setEname(employeeDao.findById(task.getEid()).getEname());
		taskVO.setBid(employeeDao.findById(task.getEid()).getBid());
		taskVO.setBname(departmentDao.findById(employeeDao.findById(task.getEid()).getBid()).getDname());
		return taskVO;
	}

	private List<TaskVO> changeList(List<Task> tasks) {
		List<TaskVO> taskVOs = new ArrayList<TaskVO>();
		for (Task task : tasks) {
			taskVOs.add(change(task));
		}
		return taskVOs;
	}

	@Override
	public List<TaskVO> findByEid(int eid) {
		return changeList(taskDao.findByEid(eid));
	}

	@Override
	public TaskVO findByTid(int tid) {
		return change(taskDao.findByTid(tid));
	}

	@Override
	public List<TaskVO> findAll() {
		return changeList(taskDao.findAll());
	}

	@Override
	public boolean add(Task task) {
		return taskDao.add(task);
	}

	@Override
	public boolean delete(int tid) {
		return taskDao.delete(tid);
	}

	@Override
	public boolean update(Task task) {
		return taskDao.update(task);
	}

	@Override
	public List<TaskVO> findByBid(int bid) {
		List<EmployeeVO> employeeVOs = changeEmpList(employeeDao.findByDid(bid));
		List<TaskVO> taskVOs = new ArrayList<TaskVO>();
		for (EmployeeVO employeeVO : employeeVOs) {
			for (TaskVO taskVO : changeList(taskDao.findByEid(employeeVO.getEid()))) {
				taskVOs.add(taskVO);
			}
		}
		return taskVOs;
	}

}
