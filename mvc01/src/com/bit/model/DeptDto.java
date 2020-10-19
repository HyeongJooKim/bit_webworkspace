package com.bit.model;

public class DeptDto {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto() {
		//반드시 디폴트 생성자를 명시할 것
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}