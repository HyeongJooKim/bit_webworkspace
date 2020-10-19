package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class OneAction implements Action, ModelDriven {

	int deptno;
	DeptVo bean;

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	public DeptVo getBean() {
		return bean;
	}

	@Override
	public String execute() throws Exception {
		bean=new DeptDao().selectOne(deptno);
		
		return Action.SUCCESS;
	}

	@Override
	public Object getModel() {
		return bean;
	}

}
