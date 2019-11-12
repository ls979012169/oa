package com.oa.vo;

/**
 * @author cjg
 * @category 打卡表的VO表
 */
public class AttendanceVO {
	/**
	 * 打卡编号
	 */
	private int id;
	/**
	 * 员工编号
	 */
	private int eid;
	/**
	 * 打卡人姓名
	 */
	private String ename;
	/**
	 * 打卡人部门
	 */
	private String dept;
	/**
	 * 打卡时间
	 */
	private String date;

	public AttendanceVO() {
		super();
	}

	public AttendanceVO(int id, int eid, String ename, String dept, String date) {
		super();
		this.id = id;
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
