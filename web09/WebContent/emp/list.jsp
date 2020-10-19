<%@page import="com.bit.*, java.sql.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>web09/emp/list</title>
</head>
<body>
	<h1>리스트 페이지</h1>
			<table width=80%>
				<tr>
					<th>사번</th>
					<th>이름</th>
					<th>날짜</th>
					<th>금액</th>
				</tr>
				<%
				ArrayList <EmpDto> list=new ArrayList<EmpDto>();
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				try{
					conn=MyOracle.getConnection();
					stmt=conn.createStatement();
					rs=stmt.executeQuery("select * from emp02 order by sabun");
					while(rs.next()){
						EmpDto bean=new EmpDto();
						bean.setSabun(rs.getInt("sabun"));
						bean.setName(rs.getString("name"));
						bean.setNalja(rs.getDate("nalja"));
						bean.setPay(rs.getInt("pay"));
						list.add(bean);
					}
				}finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}
				for(EmpDto bean : list){
				%>
				<tr>
					<!-- title에만 .jsp 붙인 거라 앞뒤 바꿔도 같다 -->
					<td><a href="?sabun=<%=bean.getSabun() %>&title=emp/detail"><%=bean.getSabun() %></a></td>
					<td><a href="?title=emp/detail&sabun=<%=bean.getSabun() %>"><%=bean.getName() %></td>
					<td><%=bean.getNalja() %></td>
					<td><%=bean.getPay() %></td>
				</tr>
				<%
				}
				%>
			</table>
			<a href="?title=emp/add">[입력]</a>
</body>
</html>