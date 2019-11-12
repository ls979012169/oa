package com.oa.vo;

import java.sql.Date;

/**
 * @author wyr
 *
 */
public class TaskVO {
	/**
	 * 任务ID
	 */
	private int tid;

	/**
	 * 员工ID
	 */
	
	private int eid;

	/**
	 * 任务内容
	 */
	
	private String tdef;

	/**
	 * 分配日期
	 */
	private Date sdate;

	/**
	 * 截止日期
	 */
	private Date edate;
	/**
	 * 员工姓名
	 */
	private String ename;
	/**
	 * 员工部门编号
	 */
	private int bid;
	/**
	 * 员工所在部门
	 */
	private String bname;
	public TaskVO() {
		super();
		
	}
	public TaskVO(int tid, int eid, String tdef, Date sdate, Date edate, String ename, int bid, String bname) {
		super();
		this.tid = tid;
		this.eid = eid;
		this.tdef = tdef;
		this.sdate = sdate;
		this.edate = edate;
		this.ename = ename;
		this.bid = bid;
		this.bname = bname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getTdef() {
		return tdef;
	}
	public void setTdef(String tdef) {
		this.tdef = tdef;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
      
}
