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
	 //���� ������ �޼ҵ�
	 private void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		 res.setContentType("text/html; charset=utf-8");
//		 PrintWriter out=res.getWriter();
//		 out.println("<h2>get method</h2>");
//		 get ��� ������� ��������
//		 res.setStatus(res.SC_METHOD_NOT_ALLOWED);
		 res.sendError(res.SC_METHOD_NOT_ALLOWED);
//		 res.sendError(405);
//		 res.setStatus(res.SC_NOT_FOUND);
//		 res.sendError(404);
	}
	
	//���� ������ �޼ҵ�
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
	
	//�ڵ����� ȣ��� �޼ҵ�
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		
		javax.servlet.http.HttpServletRequest request=(HttpServletRequest) req;
		javax.servlet.http.HttpServletResponse response=(HttpServletResponse) res;
		//�츮�� ������ ���� ���� �� �� �͵�.
		String method=request.getMethod();
		System.out.println(method);
		//form tag�� ���� �����ϸ� post, �ּ�â�� �ٷ� ġ�� get
		//http://localhost:8080/mvc01/ex05?msg=getget  
		//�̷����̸� get ������� �޾� ��� ������� ����
		if("POST".equals(method)){
			doPost(request,response);
		}else if("GET".equals(method)){
			doGet(request,response);
		}
	}
}