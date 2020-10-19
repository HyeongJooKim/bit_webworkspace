package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDao;

public class UpdateController implements Controller {
	EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int sabun=Integer.parseInt(request.getParameter("sabun"));
		String name=request.getParameter("name");
		String sub=request.getParameter("sub");
		int pay=Integer.parseInt(request.getParameter("pay"));
		int result=dao.updateOne(sabun,name,sub,pay);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:detail.bit?idx="+sabun);
		return mav;
	}

}
