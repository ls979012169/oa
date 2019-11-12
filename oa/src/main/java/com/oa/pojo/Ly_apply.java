package com.oa.pojo;

import java.sql.Date;

/**
 * @author xxl
 * @category 资产领用申请表
 */
public class Ly_apply {

	/**
	 * 资产领用申请表编号
	 */
	private int apid;

	/**
	 * 申请人编号
	 */
	private int eid;

	/**
	 * 库存编号
	 */
	private int iid;

	/**
	 * 审核
	 */
	private int sta_id;

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

	public Ly_apply() {
		super();
	}

	public Ly_apply(int eid, int iid, int sta_id, int apnumber, Date apdate, Date pdate) {
		super();
		this.eid = eid;
		this.iid = iid;
		this.sta_id = sta_id;
		this.apnumber = apnumber;
		this.apdate = apdate;
		this.pdate = pdate;
	}

	public Ly_apply(int apid, int eid, int iid, int sta_id, int apnumber, Date apdate, Date pdate) {
		super();
		this.apid = apid;
		this.eid = eid;
		this.iid = iid;
		this.sta_id = sta_id;
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

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public int getSta_id() {
		return sta_id;
	}

	public void setSta_id(int sta_id) {
		this.sta_id = sta_id;
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
