package com.bit.framework.dept.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import com.bit.framework.dept.model.DeptDao;
import com.bit.framework.dept.model.entity.DeptVo;

//public class InsertController extends AbstractController {
//
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
//			throws Exception {
//
//		return null;
//	}

public class InsertController extends AbstractCommandController {
	
	Logger log=Logger.getLogger(this.getClass());
	DeptDao deptDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	
	public void onBindAndValidate(HttpServletRequest request, Object command, BindException errors) {
//	validation method. handle 이전에 실행됨
		DeptVo bean=(DeptVo)command;
		if(bean.getDname()==null) {
			ObjectError error=new ObjectError("dname","input dept name!");
			errors.addError(error);
		}else if(bean.getDname().isEmpty()) {
			ObjectError error=new ObjectError("dname","input dept name!");
			//BindException errors에 값 실어 보내려고 함
			errors.addError(error);
		}
		if(bean.getLoc()==null) {
			ObjectError error=new ObjectError("loc","input location!");
			errors.addError(error);
		}else if(bean.getLoc().isEmpty()) {
			ObjectError error=new ObjectError("loc","input location!");
			//BindException errors에 값 실어 보내려고 함
			errors.addError(error);
		}
		log.debug(errors);
	}
	
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
//		String dname=request.getParameter("dname");
//		String loc=request.getParameter("loc");
	
//		log.debug("dname:"+dname+",loc:"+loc);
//		log.debug(command);

		String path="redirect:/dept/list.bit";
		
//		command : Object로 세터 역할 해줌
		log.debug(command);
		DeptVo bean=(DeptVo)(command);
		if(errors.hasErrors()) {
			path="dept/add";
		}else {
			deptDao.insertOne(bean);
		}
		return new ModelAndView(path);
//		이번엔 /spring03 없어야 함. 이미 conetext 가지고 있음
	}
}