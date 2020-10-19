package com.bit.web07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�� ���� �ȿ� �ִ� src ���ϵ��� ������ ���⿡�� �ϴ� �� �ƴ�
//���� main ���� ���� ����. ���� .java�� .class�� �������ϰ� ���� ������ �Ǵ� ��ó��
//���� �ҽ� ���ϵ��� ������ �����ؾ� ��. �� ���̵��� �����̶� �ϴ� ��
//�ʱ� java�� ���� �����ϴ� ���. �ʹ� �����ϴ�. jsp ���� �ķ� �ʹ� �������� �̷��� ����. 
//doGet doPost �� �� �ϳ��� ���� ��. �� �� �Դ� ���� �� �� ����. 
//�׷��� ������ �� ���� �� ����.
//���ȿ��� ������. post, get �� ������ ���� ������θ� �ǰ� ��õ����ǹǷ�.
//ȭ�鿡�� �������� �ּҴ� ��� �������� �ʴ� ������. ���� ���� ���⵵ �ȵ�. ���� ����
//�ӵ��� ����
//������ html�� ���� ������ �� �� ����.
//���ϴ� Ÿ�� Ȯ���� �ƹ����̳� ������� ������ �� ����. 
//web.xml���� <url-pattern>���� ������� �����ϸ� �װ� �ּҰ� ��.
//mvc2 model: servlet, jsp�� ������ ���� ��.

public class Ex02 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		String msg="<html><head><meta charset=\"euc-kr\"></head><body><h1>Ex02 page</h1></body></html>";
		//��� ��ɵ� ����. req, resp ������ ��� ���� �ذ��ؾ� ��
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
