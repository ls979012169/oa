package com.oa.dao;


import java.util.List;

import com.oa.pojo.Department;

/**
 * @author Administrator
 * @category 部门数据库访问层
 */
public interface DepartmentDao {
	
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
