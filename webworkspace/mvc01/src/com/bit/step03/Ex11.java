package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//<servlet>
//	<servlet-name>ex09</servlet-name>
//	<servlet-class>com.bit.step03.Ex09</servlet-class>
//	<init-param>
//		<param-name>msg9</param-name>
//		<param-value>abcdefg</param-value>
//	</init-param>
//</servlet>
//<servlet-mapping>
//	<servlet-name>ex09</servlet-name>
//	<url-pattern>/ex09</url-pattern>
//</servlet-mapping>

//이거 대신 아래처럼 annotation으로도 할 수 있음.
//프로젝트할 때는 둘 중 한 방식을 선택해서 하나만 해라.
//장단점 있다
//xml: 갱신 잘 안되고 복잡. 구조가 한눈에 보여서 문제해결이 더 쉽다.
//annotation: 간단. 그러나 문제 생길 경우 클래스들 다 열어봐야 함. 

//@WebServlet("/ex11")
//@WebServlet(urlPatterns={"/ex11","/ex11.bit"})
//반드시 클래스 이름 전에 위치해야 함
@WebServlet(value={"/ex11","/ex11.bit"},initParams={
		@WebInitParam(name="msg",value="abcd")
		,@WebInitParam(name="msg2",value="1234")
		//배열로 여러값 줄 수 있음
})
public class Ex11 extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String value=getInitParameter("msg");
		Enumeration<String> enu=getInitParameterNames();
		while(enu.hasMoreElements()){
			String value=getInitParameter(enu.nextElement());
			System.out.println(value);
		}
//		System.out.println(value);
		PrintWriter out=resp.getWriter();
		out.println("<h1>annotation mapping</h1>");
	}
}
