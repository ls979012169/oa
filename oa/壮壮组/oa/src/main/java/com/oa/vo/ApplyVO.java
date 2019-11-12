package com.oa.vo;

import java.sql.Date;

/**
 * @author cjg
 * @category 请假申请表的VO表
 */
public class ApplyVO {

	/**
	 * 申请编号
	 */
	private int id;
	/**
	 * 请假人编号
	 */
	private int uid;

	/**
	 * 请假人
	 */
	private String sname;

	/**
	 * 部门名称
	 */
	private String dept;
	/**
	 * 事由
	 */
	private String reason;
	/**
	 * 请假类型
	 */
	private String type;
	/**
	 * 申请时间
	 */
	private Date s_date;
	/**
	 * 起始时间
	 */
	private Date q_date;
	/**
	 * 结束时间
	 */
	private Date z_date;
	/**
	 * 审批时间
	 */
	private Date pdate;
	/**
	 * 审核状态编号
	 */
	private int sid;

	/**
	 * 申请状态
	 */
	private String state;

	public ApplyVO() {
		super();
	}

	public ApplyVO(int id, int uid, String sname, String dept, String reason, String type, Date s_date, Date q_date,
			Date z_date, Date pdate, int sid, String state) {
		super();
		this.id = id;
		this.uid = uid;
		this.sname = sname;
		this.dept = dept;
		this.reason = reason;
		this.type = type;
		this.s_date = s_date;
		this.q_date = q_date;
		this.z_date = z_date;
		this.pdate = pdate;
		this.sid = sid;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getS_date() {
		return s_date;
	}

	public void setS_date(Date s_date) {
		this.s_date = s_date;
	}

	public Date getQ_date() {
		return q_date;
	}

	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}

	public Date getZ_date() {
		return z_date;
	}

	public void setZ_date(Date z_date) {
		this.z_date = z_date;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
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

}
