package com.bit.step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex08 extends MyServlet2 {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		String msg=req.getParameter("msg");
		System.out.println("call GET..."+msg);
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		String msg=req.getParameter("msg");
		System.out.println("call POST..."+msg);
	}
	protected void doPut(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		String msg=req.getParameter("msg");
		System.out.println("call PUT..."+msg);
		//parameter가 전달되긴 하나 이런 식으로는 출력이 안됨
		
		ServletInputStream is=req.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		System.out.println(br.readLine());
	}
	protected void doDelete(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		String msg=req.getParameter("msg");
		System.out.println("call DELETE..."+msg);
		//parameter가 전달되긴 하나 이런 식으로는 출력이 안됨
		
		BufferedReader br=new BufferedReader(new InputStreamReader(req.getInputStream()));
		System.out.println(br.readLine());
		
	}
}
