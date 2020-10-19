package com.bit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.model.DeptDao;
import com.bit.model.entity.DeptVo;

public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Index Controller run...");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		
		List<DeptVo> list=new DeptDao().selectAll();
//		request.setAttribute("alist", list);
		mav.addObject("alist",list);
		System.out.println("Controller"+list.toString());
		return mav;
	}
}