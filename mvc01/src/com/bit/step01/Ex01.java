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
		//���� �ѹ�
		
	}
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		System.out.println("service"+this.hashCode());
		//���� ��ħ�Ҷ����� ����
		PrintWriter out=resp.getWriter();
		out.println("<h1>hello world</h1>");
	}

	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig"+this.hashCode());
		return this.config;
	}

	public String getServletInfo() {
		System.out.println("getServletInfo"+this.hashCode());
		return "�� ������....";
	}

	public void destroy() {
		System.out.println("destroy"+this.hashCode());
		//�����
	}
}
//�ϳ��� ��ü�� �� ��� ���� ���� �����
//init599038316
//service599038316
//destroy599038316
//�ٽ������ϸ� �ٸ� ��ü�� ��. �� ���ῡ �ϳ��� ��ü ���
//init836676363
//�ڹ� ������ �ָ�޾Ҵ� ���� : 
//�������� �����񽺴� �־���. 
//��: perl�̶� ��ũ���� �� ����ؼ� .cgi ���Ϸ� �� ���� ����. 
//�� ���, ���ٸ��� compile �Ź� �ϴ� ����̾��µ�
//������ ��ü �ϳ��� ����� ����, �� �� compile�ϰ� �����ϴ� ���.
//�ڿ������� singleton ����ϴ� ��. ����ӵ� ��������.