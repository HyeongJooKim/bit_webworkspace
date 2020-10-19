package com.bit.dept.action;

import java.util.List;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {

	List<DeptVo> list;
	
	public List<DeptVo> getList() {
		return list;
	}

	public void setList(List<DeptVo> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		list=new DeptDao().selectAll();
		return Action.SUCCESS;
	}
}