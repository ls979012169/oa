package com.oa.pojo;

import java.util.Date;

/**
 * @author Song
 * @category 员工表
 */
public class Employee {

	/**
	 * 员工编号
	 */
	private int eid;
	/**
	 * 员工姓名
	 */
	private String ename;
	/**
	 * 员工密码
	 */
	private String password;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 职位编号
	 */
	private int zid;
	/**
	 * 部门编号
	 */
	private int bid;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 入职时间
	 */
	private Date date;
	/**
	 * 部门
	 */
	private Department department;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String password, String sex, int zid, int bid, String tel, Date date) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.password = password;
		this.sex = sex;
		this.zid = zid;
		this.bid = bid;
		this.tel = tel;
		this.date = date;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
