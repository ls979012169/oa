package com.oa.html;

import com.oa.vo.EmployeeVO;

/**
 * @author xxl
 * @category 用于返回登录数据
 */
public class LoginObject {

	/**
	 * 是否登陆成功
	 */
	private String result;

	/**
	 * 登陆成功的员工
	 */
	private EmployeeVO employeeVO;

	public LoginObject() {
		super();
	}

	public LoginObject(String result, EmployeeVO employeeVO) {
		super();
		this.result = result;
		this.employeeVO = employeeVO;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public EmployeeVO getEmployeeVO() {
		return employeeVO;
	}

	public void setEmployeeVO(EmployeeVO employeeVO) {
		this.employeeVO = employeeVO;
	}

}
