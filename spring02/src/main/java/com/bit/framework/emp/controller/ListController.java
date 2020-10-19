package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDao;

public class ListController implements Controller {
	EmpDao dao;
//	servlet.xml에서 생성한 객체를 받아오고 싶다. 그러나 스프링에서는 세터 게터로는 못받아옴

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		EmpDao dao=new EmpDao();
		ModelAndView mav=new ModelAndView();
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("emp/list");
		return mav;
	}
}