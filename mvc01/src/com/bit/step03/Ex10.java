package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex10 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String initValue=getInitParameter("msg9");
		
		String initValue=req.getServletContext().getInitParameter("bit");
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>page10 Context value: "+initValue+"</h1>");
		
	}
}
