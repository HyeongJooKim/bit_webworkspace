package com.bit.step02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex04 extends GenericServlet {
//마치 MyServlet 클래스의 service를 abstract으로, 
//클래스도 abstract으로 한 것처럼 동작해주는 것.
//강제로 service 메소드를 구현하도록 해줌

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out=res.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head><meta charset=\"utf-8\"></head>");
		out.println("<body>");
		out.println("<h1>Extends GenericServlet</h1>");
//		out.println("<form action=\"ex05\" method=\"post\">");
		out.println("<form action=\"ex06\" method=\"post\">");
		//주소창에서 안보이긴 하지만,
		//사용자가 주소창에 ?msg=1234 이런 식으로 입력해버려도 수행해주는 문제.
		//서블릿의 장점을 살릴 수 없다. 
		//ex05 가 get, post를 구분해서 수행할 수 있도록 바꿔보자
		out.println("<input type=\"text\" name=\"msg\"/>");
		out.println("<button>전송</button>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
