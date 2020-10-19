package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EditAction extends ActionSupport implements Action, ModelDriven<DeptVo>, Preparable {

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
	public DeptVo getModel() {
		return bean;
	}

	@Override
	public void validate() {
		if(bean.getDname().isEmpty()) {
			addFieldError("dname","please add dname");
		}
		if(bean.getLoc().isEmpty()) {
			addFieldError("loc","please add loc");
		}
	}
	
	@Override
	public String execute() throws Exception {
		new DeptDao().updateOne(bean);
		return Action.SUCCESS;
	}
}
