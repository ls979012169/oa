package com.oa.pojo;

/**
 * @author Administrator
 * @category 部门实体类
 */
public class Department {
	
	/**
	 * 部门编号
	 */
	private int id;
	/**
	 * 部门名称
	 */
	private String dname;
	
	public Department() {
		super();
	}

	public Department(int id, String dname) {
		super();
		this.id = id;
		this.dname = dname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
