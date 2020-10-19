package com.bit.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex02 implements Filter{
   String encoding;

   @Override
   public void destroy() {
      System.out.println("Filter destroy��");
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response,
         FilterChain chain) throws IOException, ServletException {
      System.out.println("Filter doFilter��");
      HttpServletResponse resp = (HttpServletResponse)response;
      HttpServletRequest req = (HttpServletRequest)request;
//      ServletRequest resp = (HttpServletResponse)response;
      req.getParameter("encoding");
      PrintWriter out = response.getWriter();
      out.print("abcdefg�� id=  "+req.getParameter("id")+" : "+req.getMethod());
      out.print("encoding : "+encoding);
      out.flush();
      
      //�������� http://localhost:8080/framework01/ex01?id=12343 ġ�� �Ʒ� ��� ����
      //abcdefg? id=  12343 : GETencoding : utf-8
      
      System.out.println("Filter doFilter..."+encoding);
      req.setCharacterEncoding(encoding);
      chain.doFilter(request, response);
      
   }

   @Override
   public void init(FilterConfig Config) throws ServletException {
      System.out.println("Filter init��" + Config.toString());
      encoding = Config.getInitParameter("encoding"); 
      
   }
}