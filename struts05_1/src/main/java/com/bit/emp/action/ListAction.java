package com.bit.emp.action;

import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {
	List<EmpVo> list;
	
	public List<EmpVo> getList() {
		return list;
	}

	public void setList(List<EmpVo> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		list=new EmpDao().selectAll();
		return Action.SUCCESS;
	}
}