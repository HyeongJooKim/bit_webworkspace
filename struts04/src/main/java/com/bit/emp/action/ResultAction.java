package com.bit.emp.action;

import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.Validateable;

//public class ResultAction implements , Preparable, ModelDriven<EmpVo>,Validateable {
//use ActionSupport for Action, Validateable
public class ResultAction extends ActionSupport implements Preparable, ModelDriven<EmpVo>{

	EmpVo bean;
	
	public EmpVo getBean() {
		return bean;
	}
	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	
	@Override //Action
	public String execute() throws Exception {
//		System.out.println(bean);
//		if(bean.getSabun()==0) {
//			return Action.INPUT;
//		}
//		if(bean.getName().isEmpty()) {
//			return Action.INPUT;
//		}
		return Action.SUCCESS;
	}
	
	@Override //ModelDriven
	public EmpVo getModel() {
		return bean;
	}
	
	@Override //Preparable
	public void prepare() throws Exception {
		bean=new EmpVo();
	}
	
	@Override //Validateable
	public void validate() {
//		System.out.println("validation...");
		if(bean.getSabun()==0) {
			addFieldError("sabun","sabun error cannot be empty and int");
		}
		if(bean.getName().isEmpty()) {
			addFieldError("name","name error cannot be empty");
		}
	}
}