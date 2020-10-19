<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>DEPT List</title>
<!-- loading bootstrap css -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
<!-- loading jquery -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<!-- loading bootstrap js -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
    <style type="text/css">
    	#footer{
    		background-color: #eeeeee;
    		text-align: center;
    	}
    	tr>td:first-child{
    		width: 100px;
    	}
    	td>a{
    		display: block;
    	}
    </style>
</head>
<body>
<div class="container" id="header">
	<div class="row">
	  <div class="col-md-12">
	    <img src="https://www.bitcamp.co.kr/images/logo.png"/>
	  </div>
	</div>
	
	<div class="row" id="menu">
	  <div class="col-md-3"></div>
	  <div class="col-md-2"><a href="index.action">HOME</a></div>
	  <div class="col-md-2"><a href="emp.action">EMP</a></div>
	  <div class="col-md-2"><a href="dept.action">DEPT</a></div>
	  <div class="col-md-3"></div>
	</div>
	
	<div class="row" id="content">
	  <div class="col-md-12">
	  	<div class="jumbotron">
			<h2>DEPT List Page</h2>
			<p><a class="btn btn-primary btn-lg" href="dadd.action" role="button">Add Dept</a></p>
		</div>
		<table class="table">
			<tr>
				<th>DEPTNO</th>
				<th>DNAME</th>
				<th>LOC</th>
			</tr>
			<c:forEach items="${list }" var="bean">
				<tr>
					<th><a href="ddetail.action?deptno=${bean.deptno }">${bean.deptno }</a></th>
					<th><a href="ddetail.action?deptno=${bean.deptno }">${bean.dname }</a></th>
					<th><a href="ddetail.action?deptno=${bean.deptno }">${bean.loc }</a></th>
				</tr>
			</c:forEach>
		</table>
	  </div>
	</div>
	<div class="row" id="footer">
	  <div class="col-md-12">
	  	<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
		Copyright &copy; 비트캠프 All rights reserved.
	  </div>
	</div>
</div>
</body>
</html>