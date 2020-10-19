package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex11Action implements Action {
	
	private int num;
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		//req, res 없이 어찌 값을 받아오나? setter
		System.out.println("id:"+id+",num:"+num);
		return this.SUCCESS;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
