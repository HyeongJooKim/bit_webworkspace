package com.bit.emp;

import java.sql.Date;

//javaBean > 웹으로 넘어오면서 DTO (data transfer object) > VO (value object)라 부르는 이름 바뀜
public class EmpDto {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;
	
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
	public Date getNalja() {
		return nalja;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
}
