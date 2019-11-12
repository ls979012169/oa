package com.oa.html;

/**
 * @author xxl
 * @category 用来展示的实时考勤表
 */
public class AttendanceToShow {

	/**
	 * 员工编号
	 */
	private int eid;

	/**
	 * 员工姓名
	 */
	private String ename;

	/**
	 * 员工部门
	 */
	private String dname;

	/**
	 * 员工职务
	 */
	private String pname;

	/**
	 * 第1天打卡情况
	 */
	private String state1;

	/**
	 * 第2天打卡情况
	 */
	private String state2;

	/**
	 * 第3天打卡情况
	 */
	private String state3;

	/**
	 * 第4天打卡情况
	 */
	private String state4;

	/**
	 * 第5天打卡情况
	 */
	private String state5;

	/**
	 * 第6天打卡情况
	 */
	private String state6;

	/**
	 * 第7天打卡情况
	 */
	private String state7;

	public AttendanceToShow() {
		super();
	}

	public AttendanceToShow(int eid, String ename, String dname, String pname, String state1, String state2,
			String state3, String state4, String state5, String state6, String state7) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
		this.pname = pname;
		this.state1 = state1;
		this.state2 = state2;
		this.state3 = state3;
		this.state4 = state4;
		this.state5 = state5;
		this.state6 = state6;
		this.state7 = state7;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getState3() {
		return state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	public String getState4() {
		return state4;
	}

	public void setState4(String state4) {
		this.state4 = state4;
	}

	public String getState5() {
		return state5;
	}

	public void setState5(String state5) {
		this.state5 = state5;
	}

	public String getState6() {
		return state6;
	}

	public void setState6(String state6) {
		this.state6 = state6;
	}

	public String getState7() {
		return state7;
	}

	public void setState7(String state7) {
		this.state7 = state7;
	}

}
