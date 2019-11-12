package com.oa.pojo;

import java.sql.Date;

/**
 * @author wyr
 * @category个人任务
 */
public class Task {

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

	public Task() {
		super();

	}

	public Task(int tid, int eid, String tdef, Date sdate, Date edate) {
		super();
		this.tid = tid;
		this.eid = eid;
		this.tdef = tdef;
		this.sdate = sdate;
		this.edate = edate;
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
}
