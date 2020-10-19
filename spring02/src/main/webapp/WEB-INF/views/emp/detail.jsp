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
		$(function(){
			$('#content form').one('submit',function(){
				$('form input').prop('readonly',false);
				$('form input').first().prop('readonly',true);
				return false;
				});
		});
	</script>
	<title>emp/detail.jsp</title>
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
		  <div class="col-md-12">
	<form class="form-horizontal" method="post">
			  <div class="form-group">
			    <label for="sabun" class="col-sm-2 control-label">sabun</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="sabun" id="sabun" value="${bean.sabun }" readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="sub" class="col-sm-2 control-label">sub</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="sub" id="sub" value="${bean.sub }" readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">name</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="name" id="name" value="${bean.name }" readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="nalja" class="col-sm-2 control-label">nalja</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="nalja" id="nalja" value="${bean.nalja }" readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="pay" class="col-sm-2 control-label">pay</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="pay" id="pay" value="${bean.pay }" readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">수 정</button>
			    </div>
			  </div>
			</form>
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