package com.bit.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	//받는 쪽도 Post 여야 하고, 이경우는 이 주소를 직접 주소창에 치면 접근할 수 있음
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	//받는 쪽도 Post 여야 하고, 이경우는 이 주소를 직접 주소창에 쳐도 접근이 불가함
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");//보내는 쪽 인코딩
		String id=req.getParameter("id");
		resp.setContentType("application/xml; charset=utf-8");
		resp.setCharacterEncoding("utf-8");//받는 쪽 인코딩
		PrintWriter out=resp.getWriter();
//		out.println(id+"님 환영합니다");
//		out.println("GET service");
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<students>");
		for(int i=0; i<5; i++){
			out.println("<student>");
			out.println("<num>"+(i+1)+"</num>");
			out.println("<name>user"+(i+1)+"</name>");
			out.println("<kor>"+(100-(i+1)*10)+"</kor>");
			out.println("<eng>"+(100-(i+1)*10)+"</eng>");
			out.println("<math>"+(100-(i+1)*10)+"</math>");
			out.println("</student>");
		}
		out.println("</students>");
		out.close();
		//서버 작업 할 때는 서버 끄고 하기
	}
}