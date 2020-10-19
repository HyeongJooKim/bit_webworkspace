package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex01Action implements Action {

	@Override
	public String execute() throws Exception {
		
		System.out.println("struts action...");
		return "success";
	}
	//browser: http://localhost:8080/struts01/hello.action 치면
	//console: struts action... 나옴
	//Struts에서는 컨트롤러 대신 액션이란 용어 사용
	//Filter 방식 사용, servlet 아님.
	//execute() 여기 인자가 없는데 어찌 값을 받지?
}
