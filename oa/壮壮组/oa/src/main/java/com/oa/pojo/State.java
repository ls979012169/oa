package com.oa.pojo;

/**
 * @author TREX
 * @category 审核状态表
 */
public class State {

	/**
	 * 编号 
	 */
	private int id;
	
	/**
	 * 状态
	 */
	private String state;

	
	public State() {
		super();
	}

	public State(int id, String state) {
		super();
		this.id = id;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
