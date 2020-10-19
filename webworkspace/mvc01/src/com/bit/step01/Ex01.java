package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet {
	
	ServletConfig config;
	
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
		System.out.println("init"+this.hashCode());
		//최초 한번
		
	}
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		System.out.println("service"+this.hashCode());
		//새로 고침할때마다 동작
		PrintWriter out=resp.getWriter();
		out.println("<h1>hello world</h1>");
	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig"+this.hashCode());
		return this.config;
	}

	public String getServletInfo() {
		System.out.println("getServletInfo"+this.hashCode());
		return "이 서블릿은....";
	}

	public void destroy() {
		System.out.println("destroy"+this.hashCode());
		//종료시
	}
}
//하나의 객체만 찍어서 계속 같은 것을 사용함
//init599038316
//service599038316
//destroy599038316
//다시접속하면 다른 객체를 찍어냄. 한 연결에 하나의 객체 사용
//init836676363
//자바 서블릿이 주목받았던 장점 : 
//그전에도 웹서비스는 있었음. 
//예: perl이란 스크립팅 언어를 사용해서 .cgi 파일로 웹 서비스 가능. 
//이 경우, 매줄마다 compile 매번 하는 방식이었는데
//서블릿은 객체 하나를 만들어 놓고, 한 번 compile하고 재사용하는 방식.
//자연스럽게 singleton 사용하는 식. 수행속도 빨라진다.