package com.oa.vo;

import java.util.Date;

/**
 * @author Song
 * @category 员工VO表
 */
public class EmployeeVO {

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
     * 职位名称
     */
    private String pname;
    /**
     * 部门名称
     */
    private String dname;
    
	public EmployeeVO() {
		super();
	}
	public EmployeeVO(int eid, String ename, String password, String sex, int zid, int bid, String tel, Date date,
			String pname, String dname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.password = password;
		this.sex = sex;
		this.zid = zid;
		this.bid = bid;
		this.tel = tel;
		this.date = date;
		this.pname = pname;
		this.dname = dname;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
    
}
