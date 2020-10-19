<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*, java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web05/emp/list</title>
</head>
<body>
<!-- header -->
<%@ include file="../template/header.jspf" %>
<!-- menu -->
<%@ include file="../template/menu.jspf" %>
	<h1 align="center">EMP LIST PAGE</h1>
	<p align="right"> <a href="add.jsp">[입력]</a></p>
	<table width="95%" border=1 cellspacing=0 align="center">
		<tr bgcolor="lightgray">
			<th width=15%>사번</th>
			<th>이름</th>
			<th width=25%>날짜</th>
			<th width=25%>금액</th>
		</tr>
<%
	int p=1;
	String param=request.getParameter("p");
	if(param!=null)p=Integer.parseInt(param);
	int startNum=1+(p-1)*10;
	int endNum=10+(p-1)*10;
	String sql="select * from (select rownum as rn, sabun, name, nalja, pay from";
	sql+=" (select * from emp01 order by sabun desc)) where rn between "+startNum+" and "+endNum;
	//반복구문 모듈화
	Class.forName(driver);
	int tot=0;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select count(*) from emp01");
		if(rs.next())tot=rs.getInt(1);
		stmt.close();
		rs.close();
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
%>
		<tr>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getInt("sabun") %></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getString("name") %></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getDate("nalja") %></td>
			<td><a href="detail.jsp?idx=<%=rs.getInt("sabun") %>"><%=rs.getInt("pay") %></td>
			<!-- 이렇게 컬럼명으로 가져올 수 있음 -->
		</tr>
<%
	}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
	</table>	
	<center>
	<%
	int lang=5;
	int limit=(tot-1)/10+1;//31
	int start=((p-1)/lang)*lang;
	int end=start+lang;
	if(end>lang){
		out.print("<a href=list.jsp?p="+start+">[이전]</a>");
	}
	if(end>limit)end=limit;
	for(int i=start; i<end; i++){
	%>
			<a href="list.jsp?p=<%=i+1%>">[<%=i+1 %>]</a>
	<%
	}
	if(end<limit){
		out.print("<a href=list.jsp?p="+(end+1)+">[다음]</a>");
	}
	%>
	</center>
<!-- footer -->
<%@ include file="../template/footer.jspf" %>
</body>
</html>