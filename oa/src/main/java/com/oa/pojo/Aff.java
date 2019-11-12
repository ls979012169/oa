package com.oa.pojo;

import java.sql.Date;

/**
 * @author cjg
 * @category 通知公告实体类
 */
public class Aff {

	/**
	 * 公告编号
	 */
	private int aid;
	/**
	 * 公告内容
	 */
	private String content;
	/**
	 * 发布时间
	 */
	private Date adate;
	/**
	 * 公告标题
	 */
	private String title;

	public Aff() {
		super();
	}

	
	public Aff(int aid, String content, Date adate, String title) {
		super();
		this.aid = aid;
		this.content = content;
		this.adate = adate;
		this.title = title;
	}


	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
}
