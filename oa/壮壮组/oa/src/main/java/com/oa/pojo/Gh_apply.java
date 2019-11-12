package com.oa.pojo;

import java.sql.Date;

/**
 * @author xxl
 * @category 资产归还表
 */
public class Gh_apply {

	/**
	 * 资产归还申请表编号
	 */
	private int id;

	/**
	 * 资产领用申请表编号
	 */
	private int apid;

	/**
	 * 归还时间
	 */
	private Date ghdatetime;

	/**
	 * 审核状态编号
	 */
	private int sid;

	/**
	 * 审批时间
	 */
	private Date pdate;

	public Gh_apply() {
		super();
	}

	public Gh_apply(int apid, Date ghdatetime, int sid, Date pdate) {
		super();
		this.apid = apid;
		this.ghdatetime = ghdatetime;
		this.sid = sid;
		this.pdate = pdate;
	}

	public Gh_apply(int id, int apid, Date ghdatetime, int sid, Date pdate) {
		super();
		this.id = id;
		this.apid = apid;
		this.ghdatetime = ghdatetime;
		this.sid = sid;
		this.pdate = pdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApid() {
		return apid;
	}

	public void setApid(int apid) {
		this.apid = apid;
	}

	public Date getGhdatetime() {
		return ghdatetime;
	}

	public void setGhdatetime(Date ghdatetime) {
		this.ghdatetime = ghdatetime;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

}
