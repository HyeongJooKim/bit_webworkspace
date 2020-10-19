package com.bit.web07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//웹 폴더 안에 있는 src 파일들은 동작을 여기에서 하는 게 아님
//여기 main 만들어도 동작 안함. 원래 .java는 .class로 컴파일하고 나서 실행이 되는 것처럼
//여기 소스 파일들은 웹에서 실행해야 함. 이 아이들을 서블렛이라 하는 듯
//초기 java로 웹을 구동하던 방식. 너무 불편하다. jsp 개발 후론 너무 편리해져서 이렇게 안함. 
//doGet doPost 둘 중 하나만 골라야 함. 둘 다 왔다 갔다 할 수 없음. 
//그러나 불편한 것 빼곤 다 좋다.
//보안에는 유리함. post, get 중 결정된 서비스 방식으로만 되게 원천봉쇄되므로.
//화면에서 보여지는 주소는 사실 존재하지 않는 파일임. 내부 구조 노출도 안됨. 보안 유리
//속도도 빠름
//정적인 html을 동적 구동도 할 수 있음.
//원하는 타입 확장자 아무것이나 마음대로 지정할 수 있음. 
//web.xml에서 <url-pattern>에서 마음대로 지정하면 그게 주소가 됨.
//mvc2 model: servlet, jsp의 장점만 취한 것.

public class Ex02 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String msg="<html><head><meta charset=\"euc-kr\"></head><body><h1>Ex02 page</h1></body></html>";
		//출력 기능도 없음. req, resp 만으로 모든 것을 해결해야 함
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"euc-kr\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ex02 page</h1>");
		for(int i=0; i<5; i++){
			out.println("<p>print "+i+"</p>");
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
	}
}
