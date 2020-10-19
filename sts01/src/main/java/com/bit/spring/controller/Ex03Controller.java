package com.bit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex03Controller {
	@RequestMapping("/ex03")
	public String ex03() {
		return "home";
	}
	@RequestMapping("/ex04")
	public String ex04() {
		return "ex01";
	}
}