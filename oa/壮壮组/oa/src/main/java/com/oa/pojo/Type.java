package com.oa.pojo;

/**
 * @author wyr
 * @category报销科目
 *
 */
public class Type {

	/**
	 * 报销科目编号
	 */
	private int bid;

	/**
	 * 报销科目名
	 */
	private String bname; 

	public Type() {
		super();

	}

	public Type(String bname) {
		super();
		this.bname = bname;
	}

	public Type(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
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

}
