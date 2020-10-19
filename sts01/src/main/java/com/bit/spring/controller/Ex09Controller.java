package com.bit.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.spring.model.entity.TestBean;

@Controller
public class Ex09Controller {

	@RequestMapping("/ex14")
	public String ex02(@ModelAttribute("id") String id) { //req.setAttribute 과 같은 역할
		return "ex09";
	}
	@RequestMapping("/ex15")
	public String ex04(@ModelAttribute("bean") TestBean bean) {
		System.out.println(bean);
		return "ex15";
	}
}
