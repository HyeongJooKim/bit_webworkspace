package com.bit.action;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("ex02 Action run...");
//		return "success"; //ex02.jsp (default success)
		return "error"; //ex03.jsp
		
//		result name 5 types : success, error, input, login, none
//		사용자 정의 불가
//		  public static final java.lang.String SUCCESS = "success";
// 			action.SUCCESS;
//		  public static final java.lang.String NONE = "none";
//		  public static final java.lang.String ERROR = "error";
//		  public static final java.lang.String INPUT = "input";
//		  public static final java.lang.String LOGIN = "login";
	}
	//http://localhost:8080/struts01/ex02.action
}
