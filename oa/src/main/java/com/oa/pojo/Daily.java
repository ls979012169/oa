package com.oa.pojo;

/**
 * @author song
 * @category 个人日报实体类
 *
 */
public class Daily {
	/**
	 * 日报id
	 */
	private int did;
	/**
	 * 员工id
	 */
	private int eid;
	/**
	 * 工作内容
	 */
	private String wdef;
	/**
	 * 日期
	 */
	private String wdate;

	/**
	 * 员工
	 */
	private Employee employee;

	public Daily() {
		super();
	}

	public Daily(int did, int eid, String wdef, String wdate) {
		super();
		this.did = did;
		this.eid = eid;
		this.wdef = wdef;
		this.wdate = wdate;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getWdef() {
		return wdef;
	}

	public void setWdef(String wdef) {
		this.wdef = wdef;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

}
