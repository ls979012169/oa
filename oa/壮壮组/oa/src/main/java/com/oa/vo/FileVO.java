package com.oa.vo;

import java.util.Date;

/**
 * @author Song
 * @category 文件VO表
 */
public class FileVO {

	/**
	 * 文件编号
	 */
	private int id;
	/**
	 * 标题
	 */
	private String atitle;
	/**
	 * 上传人编号
	 */
	private int eid;
	/**
	 * 所属分类
	 */
	private String adept;
	/**
	 * 上传日期
	 */
	private Date adate;
	/**
	 * 链接
	 */
	private String lian;
	/**
	 * 员工姓名
	 */
	private String ename;
	
	public FileVO() {
		super();
	}

	public FileVO(int id, String atitle, int eid, String adept, Date adate, String lian, String ename) {
		super();
		this.id = id;
		this.atitle = atitle;
		this.eid = eid;
		this.adept = adept;
		this.adate = adate;
		this.lian = lian;
		this.ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getAdept() {
		return adept;
	}

	public void setAdept(String adept) {
		this.adept = adept;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getLian() {
		return lian;
	}

	public void setLian(String lian) {
		this.lian = lian;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
