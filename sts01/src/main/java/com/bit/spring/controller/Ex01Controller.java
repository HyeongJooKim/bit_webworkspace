package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//POJO (Plain Old Java Object)

//bean 객체 생성
@Controller
public class Ex01Controller {
	
	//url매핑
	@RequestMapping("/ex01.bit")
	public ModelAndView ex01() {
		//이렇게 심플하게만 해도 동작됨
		return new ModelAndView("ex01");
	}
}