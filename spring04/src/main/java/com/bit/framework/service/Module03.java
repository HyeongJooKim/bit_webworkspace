package com.bit.framework.service;

public class Module03 {

	int sabun;
	double su2;
	String name;
	boolean tf;
	char ch;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public void setSu2(double su2) {
		this.su2 = su2;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTf(boolean tf) {
		this.tf = tf;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	@Override
	public String toString() {
		return "Module03 [sabun=" + sabun + ", su2=" + su2 + ", name=" + name + ", tf=" + tf + ", ch=" + ch + "]";
	}
}