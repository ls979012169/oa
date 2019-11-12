package com.oa.pojo;

/**
 * @author wl
 * @category 打卡表实体类
 *
 */
public class Attendance {

	/**
	 * 打卡编号
	 */
	private int id;
	/**
	 * 员工编号
	 */
	private int eid;
	/**
	 * 打卡时间
	 */
	private String date;

	public Attendance() {
		super();
	}

	public Attendance(int id, int eid, String date) {
		super();
		this.id = id;
		this.eid = eid;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
