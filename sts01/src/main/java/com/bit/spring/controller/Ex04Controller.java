package com.bit.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex04Controller {

	@RequestMapping(value="/ex05",method=RequestMethod.GET,params= {"page"})
	//ex04 url mapping was already used in Ex03Controller
	public String ex04(HttpServletRequest req) {
		System.out.println(req.getParameter("page"));
		return "ex05";
	}
	@RequestMapping(value="/ex05",method=RequestMethod.GET)
	public String ex03(HttpServletRequest req) {
		System.out.println("page 요청 없음");
		return "ex05";
	}
	@RequestMapping("/ex/ex05")
	public String ex02() {
		return "ex05";
	}
}
