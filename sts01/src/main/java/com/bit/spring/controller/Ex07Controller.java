package com.bit.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex07Controller {

	@RequestMapping("/ex08") //ex08.jsp 존재하지 않으므로 안됨. void 하려면 같은 이름의 뷰 파일이 있어야 함
	public void ex01() {}

//	@RequestMapping("/ex09")
	public ModelAndView ex02() { //ModelAndView 의 경우 null 주면 됨
		return null;
	}
	
//	@RequestMapping("/ex10")
	public View ex03() { //View 의 경우 객체생성까지만 하면 됨
		return new View() {

			@Override
			public String getContentType() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
