package com.oa.vo;

import java.sql.Date;

/**
 * @author song
 * @category 个人日报VO表
 *
 */
public class DailyVO {
	/**
	 * 日报id
	 */
	private int did;
	/**
	 * 员工id
	 */
	private int eid;

	/**
	 * 员工姓名
	 */
	private String ename;

	/**
	 * 部门名称
	 */
	private String bname;
	/**
	 * 工作内容
	 */
	private String wdef;
	/**
	 * 日期
	 */
	private String wdate;

	public DailyVO() {
		super();
	}

	public DailyVO(int did, int eid, String ename, String bname, String wdef, String wdate) {
		super();
		this.did = did;
		this.eid = eid;
		this.ename = ename;
		this.bname = bname;
		this.wdef = wdef;
		this.wdate = wdate;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getWdef() {
		return wdef;
	}

	public void setWdef(String wdef) {
		this.wdef = wdef;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

}
