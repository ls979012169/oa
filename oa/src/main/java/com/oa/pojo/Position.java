package com.oa.pojo;

/**
 * @author xxl
 * @category 职位表
 */
public class Position {

	/**
	 * 职位编号
	 */
	private int id;

	/**
	 * 值为名称
	 */
	private String pname;

	public Position() {
		super();
	}

	public Position(String pname) {
		super();
		this.pname = pname;
	}

	public Position(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
