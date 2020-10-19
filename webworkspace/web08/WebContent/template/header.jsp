<!-- header.jsp -->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="login" class="com.bit.dept.DeptDto" scope="session"></jsp:useBean>
	<table border=0 cellspacing=0 width=100% align="center">
		<tr>
			<td bgcolor="#FADD3B">
				<img alt="" src="<%=request.getParameter("path") %>img/logo.jpg" width=100>
				<p><jsp:getProperty property="name" name="login"/>님 로그인중</p>
			</td>
		</tr>