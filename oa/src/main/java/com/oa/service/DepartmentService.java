package com.oa.service;

import java.util.List;

import com.oa.pojo.Department;

/**
 * @author Administrator
 * @category 部门业务逻辑层
 */
public interface DepartmentService {
	
	/**
	 * 根据部门id查询部门对象
	 * @param id 部门id
	 * @return
	 */
	public Department findById(int id);
	/**
	 * 查询所有部门对象
	 * @return
	 */
	public List<Department> findAll();

}
