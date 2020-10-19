<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>emp/form.jsp</title>
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
    <script type="text/javascript">
	$(function(){
		if('${title}' =='detail'){
			$('#content h1').text('상세페이지');
			$('#content form').children().last().hide();
			$('#content form input').prop('readonly',true);
			$('#content form .form-group').show();
			$('#content a').show();
		}else if('${title}' =='edit'){
			$('#content h1').text('수정페이지');
			$('#content form').attr('action','eupdate.action');
			$('#content form').children().last().show();
			$('#content form input').first().prop('readonly',true);
			$('#content form input').first().siblings().prop('readonly',false);
			$('#content a').hide();
			$('#content form .form-group').show();
		}else{
			$('#content h1').text('입력페이지');
			$('#content form').attr('action','einsert.action');
			$('#content form').children().last().show();
			$('#content a').hide();
			$('#content form .form-group').eq(0).hide().next().next().next().hide();
		}
	});
    </script>
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
		<div class="page-header">
		  <h1>상세페이지 <small>${bean.sabun }</small></h1>
		</div>
	  	<form class="form-horizontal" action="">
		  <div class="form-group">
		    <label for="sabun" class="col-sm-2 control-label">sabun</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="sabun" id="sabun" placeholder="사번" value="${bean.sabun }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="name" class="col-sm-2 control-label">name</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="name" id="name" placeholder="이름" value="${bean.name }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="sub" class="col-sm-2 control-label">sub</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="sub" id="sub" placeholder="제목" value="${bean.sub }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="nalja" class="col-sm-2 control-label">nalja</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="nalja" value="${bean.nalja }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="pay" class="col-sm-2 control-label">pay</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="pay" id="pay" placeholder="금액" value="${bean.pay }">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary btn-block">submit</button>
		      <button type="reset" class="btn btn-default btn-block">reset</button>
		    </div>
		  </div>
		</form>
		<a href="eedit.action?sabun=${bean.sabun }&title=edit" class="btn btn-primary" role="btn">수정</a>
		<a href="edelete.action?sabun=${bean.sabun }" class="btn btn-danger" role="btn">삭제</a>
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