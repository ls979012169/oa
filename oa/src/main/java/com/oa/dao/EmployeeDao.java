package com.oa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Employee;
import com.oa.vo.EmployeeVO;

/**
 * @author Song
 * @category 员工数据访问层
 */
public interface EmployeeDao {

	/**
	 * 根据员工的ID查询员工信息
	 */
	public Employee find(@Param("ename") String ename, @Param("password") String password);

	/**
	 * 添加员工
	 */
	public int add(Employee employee);

	/**
	 * 删除员工对象
	 */
	public int delete(int eid);

	/**
	 * 更新员工信息
	 */
	public int update(Employee employee);

	/**
	 * 根据员工名称查找
	 */
	public Employee findByUserName(String ename);

	/**
	 * 根据员工ID查找
	 */
	public Employee findById(int eid);

	/**
	 * 查询出来所有的员工集合
	 */
	public List<Employee> findUserList();

	/**
	 * 根据职位编号查询
	 */
	public Employee findByPid(int zid);

	/**
	 * 根据部门编号查询
	 */
	public List<Employee> findByDid(int bid);
}
