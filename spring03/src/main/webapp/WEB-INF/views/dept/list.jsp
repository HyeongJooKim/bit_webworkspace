<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
	<style type="text/css">
	</style>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	</script>
	<title>dept/list.jsp</title>
</head>
<body>
	<div class="container">
		<div class="row" id="header">
		  <div class="col-md-12">
		  	<nav class="navbar navbar-default">
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <a class="navbar-brand" href="/spring03/index.bit">Bit Edu Center</a>
			    </div>
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav">
			        <li><a href="${pageContext.request.contextPath }/emp/list.bit">EMP</a></li>
			        <li><a href="${pageContext.request.contextPath }/dept/list.bit">DEPT</a></li>
			        <li><a href="${pageContext.request.contextPath }/login.bit">LOGIN</a></li>
			      </ul>
			     </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
		  </div>
		</div>
		<div class="row" id="menu">
		  <div class="col-md-12 text-uppercase bg-info text-center" >
		  </div>
		</div>
		<div class="row" >
		  <div class="col-md-12 text-center" id="content">
		 <div class="page-header">
			  <h1>LIST PAGE <small>DEPT TABLE</small></h1>
			</div>
			<table class="table">
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="bean">
					<tr>
						<td><a href="${pageContext.request.contextPath }/dept/detail.bit?idx=${bean.deptno }" >${bean.deptno }</a></td>
						<td><a href="${pageContext.request.contextPath }/dept/detail.bit?idx=${bean.deptno }" >${bean.dname }</a></td>
						<td><a href="${pageContext.request.contextPath }/dept/detail.bit?idx=${bean.deptno }" >${bean.loc }</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add.bit" class="btn btn-primary" role="btn">Add</a>
		  </div>
		</div>
		<div class="row" id="footer">
		  <div class="col-md-12 text-center">
		  	<address><strong>비트캠프</strong>  서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
			Copyright &copy; 비트캠프 All rights reserved.
		  </div>
		</div>
	</div>
</body>
</html>