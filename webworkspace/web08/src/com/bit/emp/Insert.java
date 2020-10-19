package com.bit.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//insert는 기능만 있고 화면 필요 없으므로 서블렛으로 구현해본다

public class Insert extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");	
		
		String param1=req.getParameter("sabun");
		String param2=req.getParameter("name");
		String param3=req.getParameter("pay");
		
		int sabun=Integer.parseInt(param1.trim());
		String name=param2.trim();
		int pay=Integer.parseInt(param3.trim());
		
		EmpCRUD.insert(sabun,name,pay);
		resp.sendRedirect("list.jsp");
	}
}
