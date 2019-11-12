package com.oa.vo;

import java.sql.Date;

/**
 * @author wl
 * @category 报销申请VO表
 *
 */
public class BaoXiaoVO {

	/**
	 * 编号
	 */
	private int id;
	/**
	 * 报销科目编号
	 */
	private int bid;
	/**
	 * 报销名称
	 */
	private String bname;
	/**
	 * 申请人编号
	 */
	private int uid;
	/**
	 * 申请人姓名
	 */
	private String ename;
	 
	/**
	 * 部门名称
	 */
	private String dname;
	/**
	 * 申请时间
	 */
	private Date date;
	/**
	 * 申请金额
	 */
	private double money;
	/**
	 * 审核状态编号
	 */
	private int sid;
	/**
	 * 审核状态
	 */
	private String state;
	/**
	 * 用途
	 */
	private String use;
	/**
	 * 审批时间
	 */
	private Date pdate;
	
	public BaoXiaoVO() {
		super();
	}

	
	public BaoXiaoVO(int id, int bid, String bname, int uid, String ename, String dname, Date date, double money,
			int sid, String state, String use, Date pdate) {
		super();
		this.id = id;
		this.bid = bid;
		this.bname = bname;
		this.uid = uid;
		this.ename = ename;
		this.dname = dname;
		this.date = date;
		this.money = money;
		this.sid = sid;
		this.state = state;
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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
