package com.bit.emp.dto;

import java.sql.Date;
//java.util 아님. sql 실행해서 나올 값이니 java.sql로

//javaBean 클래스 - getter/setter로 구성됨
//encapsulation 캡슐화 - 정보를 은닉시켜 원하는 제어만 제공.
//변수는 숨겨놓고 공개된 메소드로만 접근하게 하는 것

public class Emp02Bean {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;
//	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public int getSabun() {
		return sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public Date getNalja() {
		return nalja;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
}