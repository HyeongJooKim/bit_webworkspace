<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String back=request.getParameter("callback");
String msg="({\"key1\":\"val1\",\"key2\":\"val2\"})";
out.print(back+msg);
%>