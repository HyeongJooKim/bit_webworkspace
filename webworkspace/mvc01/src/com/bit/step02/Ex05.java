package com.bit.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex05 extends GenericServlet {
	 //내가 지정한 메소드
	 private void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		 res.setContentType("text/html; charset=utf-8");
//		 PrintWriter out=res.getWriter();
//		 out.println("<h2>get method</h2>");
//		 get 방식 허용하지 않으려면
//		 res.setStatus(res.SC_METHOD_NOT_ALLOWED);
		 res.sendError(res.SC_METHOD_NOT_ALLOWED);
//		 res.sendError(405);
//		 res.setStatus(res.SC_NOT_FOUND);
//		 res.sendError(404);
	}
	
	//내가 지정한 메소드
	private void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		String msg=req.getParameter("msg");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out=res.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><meta charset=\"utf-8\"></head>");
		out.println("<body>");
		out.println("<h1>msg:"+msg+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	//자동으로 호출될 메소드
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		javax.servlet.http.HttpServletRequest request=(HttpServletRequest) req;
		javax.servlet.http.HttpServletResponse response=(HttpServletResponse) res;
		//우리가 웹에서 흔히 쓰는 건 이 것들.
		String method=request.getMethod();
		System.out.println(method);
		//form tag를 통해 접근하면 post, 주소창에 바로 치면 get
		//http://localhost:8080/mvc01/ex05?msg=getget  
		//이런식이면 get 방식으로 받아 명령 수행되지 않음
		if("POST".equals(method)){
			doPost(request,response);
		}else if("GET".equals(method)){
			doGet(request,response);
		}
	}
}