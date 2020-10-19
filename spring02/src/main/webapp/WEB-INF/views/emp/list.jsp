<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
	<style type="text/css">
	</style>
	<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="../js/bootstrap.min.js"></script>
	<script type="text/javascript">
	</script>
	<title>emp/list.jsp</title>
</head>
<body>
	<div class="container">
		<div class="row" id="header">
		  <div class="col-md-12">
		  	<h1>비트교육센터</h1>
		  </div>
		</div>
		<div class="row" id="menu">
		  <div class="col-md-12 text-uppercase bg-info text-center" >
		  	<a href="/spring02/">home</a>
		  	<a href="/spring02/emp/list.bit">emp</a>
		  	<a href="/spring02/dept/list.bit">dept</a>
		  	<a href="/spring02/login.bit">login</a>
		  </div>
		</div>
		<div class="row" id="content">
		  <div class="col-md-12 text-center">
		  	<table class="table">
		  		<thead>
		  			<tr>
		  				<th>사번</th>
		  				<th>제목</th>
		  				<th>이름</th>
		  				<th>날짜</th>
		  				<th>금액</th>
		  			</tr>
		  		</thead>
		  		<c:forEach items="${alist }" var="bean">
		  			<tr>
		  				<td><a href="detail.bit?idx=${bean.sabun }">${bean.sabun }</a></td>
		  				<td><a href="detail.bit?idx=${bean.sabun }">${bean.sub }</a></td>
		  				<td><a href="detail.bit?idx=${bean.sabun }">${bean.name }</a></td>
		  				<td><a href="detail.bit?idx=${bean.sabun }">${bean.nalja }</a></td>
		  				<td><a href="detail.bit?idx=${bean.sabun }">${bean.pay }</a></td>
		  			</tr>
		  		</c:forEach>
		  	</table>
		  	<a href="add.bit" class="btn btn-primary" role="btn">입 력</a>
		  </div>
		</div>
		<div class="row" id="footer">
		  <div class="col-md-12">
		  <address><strong>비트캠프</strong>  서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
			Copyright &copy; 비트캠프 All rights reserved.
		  </div>
		</div>
	</div>
</body>
</html>