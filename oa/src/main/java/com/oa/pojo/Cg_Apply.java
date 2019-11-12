package com.oa.pojo;

/**
 * @author song
 * @category 资产采购申请实体类
 *
 */
public class Cg_Apply {
	/**
	 * 采购编号
	 */
	private int pid;
	/**
	 * 库存编号
	 */
	private int iid;

	/**
	 * 员工编号
	 */
	private int uid;
	/**
	 * 审核状态编号
	 */
	private int sta_id;
	/**
	 * 采购数量
	 */
	private int c_number;
	/**
	 * 审批时间
	 */
	private String pdate;

	public Cg_Apply() {
		super();
	}

	public Cg_Apply(int pid, int iid, int uid, int sta_id, int c_number, String pdate) {
		super();
		this.pid = pid;
		this.iid = iid;
		this.uid = uid;
		this.sta_id = sta_id;
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

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getSta_id() {
		return sta_id;
	}

	public void setSta_id(int sta_id) {
		this.sta_id = sta_id;
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
