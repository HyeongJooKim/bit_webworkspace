package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex04Action implements Action {

	@Override
	public String execute() throws Exception {

		System.out.println("�� ��Ű������ 04 Action run...");
		return Action.SUCCESS;
	}
}
