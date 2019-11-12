package com.oa.vo;

public class DestoryVO {

	/**
	 * 资产编号
	 */
	private int pid;
	/**
	 * 库存编号
	 */
	private int iid;
	/**
	 * 报废数量
	 */
	private int pcount;
	/**
	 * 报废原因
	 */
	private String preason;
	/**
	 * 报废品牌
	 */
	private String kmold;
	/**
	 * 报废型号
	 */
	private String ktype;
	/**
	 * 报废名称
	 */
	private String Kname;
	
	
	public DestoryVO() {
		super();
	}


	public DestoryVO(int pid, int iid, int pcount, String preason, String kmold, String ktype, String kname) {
		super();
		this.pid = pid;
		this.iid = iid;
		this.pcount = pcount;
		this.preason = preason;
		this.kmold = kmold;
		this.ktype = ktype;
		Kname = kname;
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


	public int getPcount() {
		return pcount;
	}


	public void setPcount(int pcount) {
		this.pcount = pcount;
	}


	public String getPreason() {
		return preason;
	}


	public void setPreason(String preason) {
		this.preason = preason;
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


	public String getKname() {
		return Kname;
	}


	public void setKname(String kname) {
		Kname = kname;
	}
	
	
}
