package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
		
		System.out.println("struts action...");
		return "success";
	}
	//browser: http://localhost:8080/struts01/hello.action ġ��
	//console: struts action... ����
	//Struts������ ��Ʈ�ѷ� ��� �׼��̶� ��� ���
	//Filter ��� ���, servlet �ƴ�.
	//execute() ���� ���ڰ� ���µ� ���� ���� ����?
}