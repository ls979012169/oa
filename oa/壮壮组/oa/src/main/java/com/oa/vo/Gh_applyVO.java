package com.oa.vo;

import java.sql.Date;

/**
 * @author xxl
 * @category 资产归还申请表VO
 */
public class Gh_applyVO {

	/**
	 * 资产归还申请表编号
	 */
	private int id;

	/**
	 * 资产领用申请表编号
	 */
	private int apid;

	/**
	 * 申请人编号
	 */
	private int eid;

	/**
	 * 申请人姓名
	 */
	private String ename;

	/**
	 * 申请人部门编号
	 */
	private int bid;

	/**
	 * 部门名称
	 */
	private String dname;

	/**
	 * 库存编号
	 */
	private int iid;

	/**
	 * 库存名称
	 */
	private String iname;

	/**
	 * 归还时间
	 */
	private Date ghdatetime;

	/**
	 * 审核状态编号
	 */
	private int sid;

	/**
	 * 状态
	 */
	private String state;

	/**
	 * 审批时间
	 */
	private Date pdate;

	public Gh_applyVO() {
		super();
	}

	public Gh_applyVO(int apid, int eid, String ename, int bid, String dname, int iid, String iname, Date ghdatetime,
			int sid, String state, Date pdate) {
		super();
		this.apid = apid;
		this.eid = eid;
		this.ename = ename;
		this.bid = bid;
		this.dname = dname;
		this.iid = iid;
		this.iname = iname;
		this.ghdatetime = ghdatetime;
		this.sid = sid;
		this.state = state;
		this.pdate = pdate;
	}

	public Gh_applyVO(int id, int apid, int eid, String ename, int bid, String dname, int iid, String iname,
			Date ghdatetime, int sid, String state, Date pdate) {
		super();
		this.id = id;
		this.apid = apid;
		this.eid = eid;
		this.ename = ename;
		this.bid = bid;
		this.dname = dname;
		this.iid = iid;
		this.iname = iname;
		this.ghdatetime = ghdatetime;
		this.sid = sid;
		this.state = state;
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

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

}
