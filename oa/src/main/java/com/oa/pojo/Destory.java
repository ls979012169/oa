package com.oa.pojo;

/**
 * @author Administrator
 * @category 资产报废实体类
 */
public class Destory {

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
	
	public Destory() {
		super();
	}
	
	public Destory(int pid, int iid, int pcount, String preason) {
		super();
		this.pid = pid;
		this.iid = iid;
		this.pcount = pcount;
		this.preason = preason;
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
	
	
}
