package com.oa.vo;

import java.sql.Date;

/**
 * @author xxl
 * @category 资产领用申请表VO
 */
public class Ly_applyVO {

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
	 * 审核状态id
	 */
	private int sta_id;

	/**
	 * 审核状态
	 */
	private String state;

	/**
	 * 申请数量
	 */
	private int apnumber;

	/**
	 * 申请时间
	 */
	private Date apdate;

	/**
	 * 审批时间
	 */
	private Date pdate;

	public Ly_applyVO() {
		super();
	}

	public Ly_applyVO(int eid, String ename, int bid, String dname, int iid, String iname, int sta_id, String state,
			int apnumber, Date apdate, Date pdate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.bid = bid;
		this.dname = dname;
		this.iid = iid;
		this.iname = iname;
		this.sta_id = sta_id;
		this.state = state;
		this.apnumber = apnumber;
		this.apdate = apdate;
		this.pdate = pdate;
	}

	public Ly_applyVO(int apid, int eid, String ename, int bid, String dname, int iid, String iname, int sta_id,
			String state, int apnumber, Date apdate, Date pdate) {
		super();
		this.apid = apid;
		this.eid = eid;
		this.ename = ename;
		this.bid = bid;
		this.dname = dname;
		this.iid = iid;
		this.iname = iname;
		this.sta_id = sta_id;
		this.state = state;
		this.apnumber = apnumber;
		this.apdate = apdate;
		this.pdate = pdate;
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

	public int getSta_id() {
		return sta_id;
	}

	public void setSta_id(int sta_id) {
		this.sta_id = sta_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getApnumber() {
		return apnumber;
	}

	public void setApnumber(int apnumber) {
		this.apnumber = apnumber;
	}

	public Date getApdate() {
		return apdate;
	}

	public void setApdate(Date apdate) {
		this.apdate = apdate;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

}
