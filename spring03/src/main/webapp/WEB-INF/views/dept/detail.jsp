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
	<title>dept/detail.jsp</title>
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
			  <h1>DETAIL PAGE <small>DEPT TABLE</small></h1>
			</div>
			<form class="form-horizontal" action="update.bit" method="post">
			  <div class="form-group">
			    <label for="deptno" class="col-sm-2 control-label">deptno</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="deptno" id="deptno" value="${bean.deptno }" >
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="dname" class="col-sm-2 control-label">dname</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="dname" id="dname" value="${bean.dname }" >
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="loc" class="col-sm-2 control-label">loc</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="loc" id="loc" value="${bean.loc }" >
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Edit</button>
			      <a href="delete.bit?idx=${bean.deptno }" class="btn btn-default">Delete</a>
			    </div>
			  </div>
			</form>
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