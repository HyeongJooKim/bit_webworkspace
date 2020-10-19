<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>dept/add.jsp</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
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
			<h2>DEPT Add Page</h2>
		</div>

		<form action="dinsert.action" method="post">
		  <div class="form-group">
		    <label for="dname">DNAME</label>
		    <input type="text" class="form-control" name="dname" id="dname" placeholder="please add dname"/>
<!-- 		    placeholder : value는 아님. 값으로 넘어가지 않음. 보이기만 함 -->
		  </div>
		  <div class="form-group">
		    <label for="loc">LOC</label>
		    <input type="text" class="form-control" name="loc" id="loc" placeholder="please add loc"/>
		  </div>
		  <button type="submit" class="btn btn-default">Submit</button>
		</form>


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