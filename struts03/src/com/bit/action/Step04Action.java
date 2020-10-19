package com.bit.action;

import com.bit.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class Step04Action implements Action,ModelDriven<EmpVo>,Preparable {
	
	EmpVo bean;
	
//	public void EmpVo(){
//		bean=new EmpVo();
//	}
	
	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(bean);
		return Action.SUCCESS;
	}

	@Override
	public EmpVo getModel() {
		return bean;
	}

	@Override
	public void prepare() throws Exception {
		bean=new EmpVo();
		System.out.println("bean constructed...");
	}
}