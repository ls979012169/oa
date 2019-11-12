package com.oa.pojo;

/**
 * @author TREX
 * @category 库存台账
 */
public class Property {

	/**
	 * 库存编号
	 */
	private int iid;
	
	/**
	 * 库存名称
	 */
	private String iname;
	
	/**
	 * 库存类型
	 */
	private String iclass;
	
	/**
	 * 库存型号
	 */
	private String itype;
	
	/**
	 * 计量单位
	 */
	private String iunit;
	
	/**
	 * 库存数量
	 */
	private int inumber;
	

	public Property() {
		super();
	}

	public Property(int iid, String iname, String iclass, String itype, String iunit, int inumber) {
		super();
		this.iid = iid;
		this.iname = iname;
		this.iclass = iclass;
		this.itype = itype;
		this.iunit = iunit;
		this.inumber = inumber;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIclass() {
		return iclass;
	}

	public void setIclass(String iclass) {
		this.iclass = iclass;
	}

	public String getItype() {
		return itype;
	}

	public void setItype(String itype) {
		this.itype = itype;
	}

	public String getIunit() {
		return iunit;
	}

	public void setIunit(String iunit) {
		this.iunit = iunit;
	}

	public int getInumber() {
		return inumber;
	}

	public void setInumber(int inumber) {
		this.inumber = inumber;
	}
	
	
	
}
