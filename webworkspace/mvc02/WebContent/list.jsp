<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.ArrayList, com.bit.model.Emp03Dto" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC02-index.jsp</title>
<link rel="stylesheet" type="text/css" href="css/frame.css"/>
<style type="text/css">	
	#contents{
		text-align: center;
	}
	#contents>table{
		width: 500px;
		margin: 50px  auto;
	}
	#contents>table>tr{}
	#contents>table tr th{
/* 	table 아래 tbody 가 자동으로 생성되어 있음 */
		border:1px solid gray;
	}
	#contents>table tr td{
		border:1px solid gray;
	}
	#contents>table,#contents>table>tr>th,#contents>table>tr>td{
		border-collapse: collapse;
		border:1px solid gray;
	}
	#contents>table+a{
		display: block;
		width: 150px;
		height: 50px;
		background-image: linear-gradient(darkgray,gray,darkgray);
		border-radius: 25px;
		margin: 0px auto;
		text-decoration: none;
		text-align: center;
		line-height: 50px;
		color: white;
	}
	#contents table tr:first-child~tr{
		cursor: pointer;
	}

</style>

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('table tr').first().siblings().click(function(){
			var sabun=$(this).children().first().text();
			location.href='detail.bit?idx='+sabun;
		});
	});

</script>
</head>
<body>
<div>
	<div id="header">
		<h1>비트교육센터</h1>
	</div>
	<div id="menu">
		<ul>
			<li><a href="index.bit">HOME</a></li>
			<li><a href="list.bit">EMP</a></li>
			<li><a href="#">DEPT</a></li>
			<li><a href="login.bit">LOGIN</a></li>
		</ul>
	</div>
	<div id="contents">
		<h2>EMP LIST Page</h2>
		<table>
			<tr>
				<th>사번</th>
				<th>제목</th>
				<th>이름</th>
			</tr>
			<%
				ArrayList<Emp03Dto> list=(ArrayList<Emp03Dto>)request.getAttribute("alist");

				for(int i=0; i<list.size(); i++){
				Emp03Dto bean=list.get(i);
//				for(Emp03Dto bean: list){
			%>
			<tr>
				<td><%=bean.getSabun() %></td>
				<td><%=bean.getSub() %></td>
				<td><%=bean.getName() %></td>
			</tr>
			<%} %>
		</table>
		<a href="add.bit">입력</a>
	</div>
	<div id="footer">
		<address>COPYRIGHT BY BITACADEMY CO.LTD. ALL RIGHTS RESERVED.<br>HTTP://www.BITacademy.com</address>
	</div>
</div>
</body>
</html>