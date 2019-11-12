package com.oa.pojo;

import java.sql.Date;

/**
 * @author cjg
 * @category 请假实体类
 */
public class Apply {

	/**
	 * 申请编号
	 */
	private int id;
	/**
	 * 请假人编号
	 */
	private int uid;
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

	public Apply() {
		super();
	}

	public Apply(int id, int uid, String reason, String type, Date s_date, Date q_date, Date z_date, Date pdate,
			int sid) {
		super();
		this.id = id;
		this.uid = uid;
		this.reason = reason;
		this.type = type;
		this.s_date = s_date;
		this.q_date = q_date;
		this.z_date = z_date;
		this.pdate = pdate;
		this.sid = sid;
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

}
