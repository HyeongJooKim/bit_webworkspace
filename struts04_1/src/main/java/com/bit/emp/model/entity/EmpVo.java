package com.bit.emp.model.entity;

public class EmpVo {

	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpVo [sabun=" + sabun + ", name=" + name + "]";
	}
	public EmpVo(int sabun, String name) {
		super();
		this.sabun = sabun;
		this.name = name;
	}
	public EmpVo() {
	}
}