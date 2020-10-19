package com.bit.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/el/ex02.bit")
public class ELController extends HttpServlet {
	public class JavaBean{//편의상 여기 만든 것
		private int su1;
		private double su2;
		private char ch;
		private boolean tf;
		private String name;
		private Date nalja;
		
		public JavaBean() {
		}
		public int getSu1() {
			return su1;
		}
		public void setSu1(int su1) {
			this.su1 = su1;
		}
		public double getSu2() {
			return su2;
		}
		public void setSu2(double su2) {
			this.su2 = su2;
		}
		public char getCh() {
			return ch;
		}
		public void setCh(char ch) {
			this.ch = ch;
		}
		public boolean isTf() {
			return tf;
		}
		public void setTf(boolean tf) {
			this.tf = tf;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getNalja() {
			return nalja;
		}
		public void setNalja(Date nalja) {
			this.nalja = nalja;
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JavaBean bean=new JavaBean();
		bean.setSu1(1234);
		bean.setSu2(12.34);
		bean.setCh('@');
		bean.setTf(true);
		bean.setName("abcd");
		bean.setNalja(new Date());
		
		request.setAttribute("bean", bean);
		
		request.setAttribute("msg2", "request scope msg...");
		request.getRequestDispatcher("ex02.jsp").forward(request, response);
	}
}