package com.bit.dept;

public class DeptDto {
	private int num;
	private String id;
	private String pw;
	private String name;
	private int lev;
	private boolean result;//로그인되면 true
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLev() {
		return lev;
	}
	public void setLev(int lev) {
		this.lev = lev;
	}
	public boolean isResult() {//getter 대신 boolean은 is 사용
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
}
