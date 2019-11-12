package com.oa.pojo;

import java.sql.Date;

/**
 * @author wl
 * @category 报销表实体类
 *
 */
public class Baoxiao {

	/**
	 * 编号
	 */
	private int id;
	/**
	 * 报销科目编号
	 */
	private int bid;
	/**
	 * 申请人编号
	 */
	private int uid;
	 
	/**
	 * 申请时间
	 */
	private Date date;
	/**
	 * 申请金额
	 */
	private double money;
	/**
	 * 审核状态
	 */
	private int sid;
	/**
	 * 用途
	 */
	private String use;
	/**
	 * 审批时间
	 */
	private Date pdate;
	
	public Baoxiao() {
		super();
	}
	
	public Baoxiao(int id, int bid, int uid, Date date, double money, int sid, String use, Date pdate) {
		super();
		this.id = id;
		this.bid = bid;
		this.uid = uid;
		this.date = date;
		this.money = money;
		this.sid = sid;
		this.use = use;
		this.pdate = pdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	 
}
