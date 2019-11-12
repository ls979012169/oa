package com.oa.vo;

import java.util.Date;

/**
 * @author song
 * @category 资产采购申请VO表
 *
 */
public class Cg_ApplyVO {
	/**
	 * 采购编号
	 */
	private int pid;
	/**
	 * 库存编号
	 */
	private int iid;
	/**
	 * 库存名称
	 */
	private String Kname;
	/**
	 * 品牌
	 */
	private String kmold;
	/**
	 * 型号
	 */
	private String ktype;

	/**
	 * 员工编号
	 */
	private int uid;

	/**
	 * 姓名
	 */
	private String yname;

	/**
	 * 部门名称
	 */
	private String bname;
	/**
	 * 审核状态编号
	 */
	private int sta_id;
	/**
	 * 状态
	 */
	private String state;
	/**
	 * 采购数量
	 */
	private int c_number;
	/**
	 * 审批时间
	 */
	private String pdate;

	public Cg_ApplyVO() {
		super();
	}

	public Cg_ApplyVO(int pid, int iid, String kname, String kmold, String ktype, int uid, String yname, String bname,
			int sta_id, String state, int c_number, String pdate) {
		super();
		this.pid = pid;
		this.iid = iid;
		Kname = kname;
		this.kmold = kmold;
		this.ktype = ktype;
		this.uid = uid;
		this.yname = yname;
		this.bname = bname;
		this.sta_id = sta_id;
		this.state = state;
		this.c_number = c_number;
		this.pdate = pdate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getKname() {
		return Kname;
	}

	public void setKname(String kname) {
		Kname = kname;
	}

	public String getKmold() {
		return kmold;
	}

	public void setKmold(String kmold) {
		this.kmold = kmold;
	}

	public String getKtype() {
		return ktype;
	}

	public void setKtype(String ktype) {
		this.ktype = ktype;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getYname() {
		return yname;
	}

	public void setYname(String yname) {
		this.yname = yname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
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

	public int getC_number() {
		return c_number;
	}

	public void setC_number(int c_number) {
		this.c_number = c_number;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

}
