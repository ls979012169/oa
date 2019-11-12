package com.oa.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oa.pojo.Employee;
import com.oa.vo.EmployeeVO;

/**
 * @author Song
 * @category 员工业务逻辑层
 */
public interface EmployeeService {

	/**
	 * 根据员工的ID查询员工信息
	 * 
	 * @param eid
	 * @param pass
	 * @return
	 */
	public EmployeeVO find(String ename, String password);

	/**
	 * 添加员工
	 * 
	 * @param employee
	 * @return
	 */
	public boolean add(Employee employee);

	/**
	 * 删除员工对象
	 * 
	 * @param eid
	 * @return
	 */
	public boolean delete(int eid);

	/**
	 * 更新员工信息
	 * 
	 * @param employee
	 * @return
	 */
	public boolean update(Employee employee);

	/**
	 * 根据员工名称查找
	 * 
	 * @param ename
	 * @return
	 */
	public EmployeeVO findByUserName(String ename);

	/**
	 * 根据员工ID查找
	 * 
	 * @param eid
	 * @return EmployeeVO
	 */
	public EmployeeVO findById(int eid);

	/**
	 * 根据员工ID查找
	 * 
	 * @return Employee
	 */
	public Employee find(int eid);

	/**
	 * 查询出来所有的员工集合
	 * 
	 * @return 
	 */
	public List<EmployeeVO> findUserList();

	/**
	 * 根据职位编号查询
	 * 
	 * @param pname
	 * @return
	 */
	public EmployeeVO findByPid(int zid);

	/**
	 * 根据部门编号查询
	 * 
	 * @param dname
	 * @return
	 */
	public List<EmployeeVO> findByDid(int bid);
}
