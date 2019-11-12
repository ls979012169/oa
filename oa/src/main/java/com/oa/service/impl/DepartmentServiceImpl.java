package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oa.dao.DepartmentDao;
import com.oa.pojo.Department;
import com.oa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public Department findById(int id) {
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}

}
