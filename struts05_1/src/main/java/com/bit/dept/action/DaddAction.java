package com.bit.dept.action;

import java.util.List;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class DaddAction implements Action, Preparable, ModelDriven {

	DeptVo bean;
	
	public DeptVo getBean() {
		return bean;
	}

	public void setBean(DeptVo bean) {
		this.bean = bean;
	}

	@Override
	public void prepare() throws Exception {
		bean=new DeptVo();
		
	}

	@Override
	public Object getModel() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		new DeptDao().insertOne(bean);
		return Action.SUCCESS;
	}
}