package com.bit.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex06 extends MyServlet2 {
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		req.setCharacterEncoding("utf-8");
		String msg=req.getParameter("msg");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out=res.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><meta charset=\"utf-8\"></head>");
		out.println("<body>");
		out.println("<h1>Extends MyServlet2</h1>");
		out.println("<h2>msg:"+msg+"</h2>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
