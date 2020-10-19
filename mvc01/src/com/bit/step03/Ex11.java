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

//�̰� ��� �Ʒ�ó�� annotation���ε� �� �� ����.
//������Ʈ�� ���� �� �� �� ����� �����ؼ� �ϳ��� �ض�.
//����� �ִ�
//xml: ���� �� �ȵǰ� ����. ������ �Ѵ��� ������ �����ذ��� �� ����.
//annotation: ����. �׷��� ���� ���� ��� Ŭ������ �� ������� ��. 

//@WebServlet("/ex11")
//@WebServlet(urlPatterns={"/ex11","/ex11.bit"})
//�ݵ�� Ŭ���� �̸� ���� ��ġ�ؾ� ��
@WebServlet(value={"/ex11","/ex11.bit"},initParams={
		@WebInitParam(name="msg",value="abcd")
		,@WebInitParam(name="msg2",value="1234")
		//�迭�� ������ �� �� ����
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
