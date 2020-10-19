package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVo;
import com.opensymphony.xwork2.Action;

public class DeleteAction implements Action {
	int deptno;

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	@Override
	public String execute() throws Exception {
		new DeptDao().deleteOne(deptno);
		return Action.SUCCESS;
	}
}
