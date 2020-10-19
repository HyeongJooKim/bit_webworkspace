<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>el/ex01.jsp</title>
<style type="text/css">
	table, table tr,table th, table td{
		border-collapse: collapse;
		border: 1px solid gray;
	}
</style>
</head>
<body>
	<h1>JSP EL(Expression Language) 표현식 (문법)</h1>
	<p>자바 빈의 프로퍼티, 값을 JSP의 표현식이나 액션 태그 &lt;jsp:useBean&gt;를 사용하는것 보다 쉽고 간결하게 꺼낼수 있게 하는 기술이다.
또한 static 메소드를 호출할 수도 있는데 JSP에서는 주로 서블릿 보관소(JspContext, ServletRequest, HttpSession, ServletContext)에서 값을 꺼낼 때 사용한다.</p>
	<table>
		<tr>
			<th>연산</th>
			<th>java</th>
			<th>el</th>
			<th>el표기</th>
		</tr>
		<tr>
			<td>문자열</td>
			<td><%="출력" %></td>
			<td>${"출력" }</td>
			<td>＄{"출력" }</td>
		</tr>
		<tr>
			<td>숫자</td>
			<td><%=1234.0 %></td>
			<td>${1234.0 }</td>
			<td>＄{1234.0 }</td>
		</tr>
		<tr>
			<td>연산(합,차)</td>
			<td><%=5+2 %></td>
			<td>${5+2 }</td>
			<td>＄{5+2 }</td>
		</tr>
		<tr>
			<td>연산(곱)</td>
			<td><%=5*2 %></td>
			<td>${5*2 }</td>
			<td>＄{5*2 }</td>
		</tr>
		<tr>
			<td>연산(나누기)</td>
			<td><%=5/2 %></td>
			<td>${5/2 }</td>
			<td>＄{5/2 }</td>
		</tr>
		<tr>
			<td>연산(나누기 div)</td>
			<td><%=5/2 %></td>
			<td>${5 div 2 }</td>
			<td>＄{5 div 2 }</td>
		</tr>
		<tr>
			<td>연산(나누기 : 정수여도 실수 반환)</td>
			<td><%=4/2 %></td>
			<td>${4/2 }</td>
			<td>＄{4/2 }</td>
		</tr>
		<tr>
			<td>연산(나머지)</td>
			<td><%=5%2 %></td>
			<td>${5%2 }</td>
			<td>＄{5%2 }</td>
		</tr>
		<tr>
			<td>연산(나머지 mod)</td>
			<td><%=5%2 %></td>
			<td>${5 mod 2 }</td>
			<td>＄{5 mod 2 }</td>
		</tr>
		<tr>
			<td>비교</td>
			<td><%=5==5 %></td>
			<td>${5==5 }</td>
			<td>＄{5==5 }</td>
		</tr>
		<tr>
			<td>비교(eq)</td>
			<td><%=5==5 %></td>
			<td>${5 eq 5 }</td>
			<td>＄{5 eq 5 }</td>
		</tr>
		<tr>
			<td>비교(>)</td>
			<td><%=5>3 %></td>
			<td>${5>3 }</td>
			<td>＄{5>3 }</td>
		</tr>
		<tr>
			<td>비교(gt : greater than)</td>
			<td><%=5>3 %></td>
			<td>${5 gt 3 }</td>
			<td>＄{5 gt 3 }</td>
		</tr>
		<tr>
			<td>비교(<)</td>
			<td><%=5<3 %></td>
			<td>${5<3 }</td>
			<td>＄{5<3 }</td>
		</tr>
		<tr>
			<td>비교(lt : less than)</td>
			<td><%=5>3 %></td>
			<td>${5 lt 3 }</td>
			<td>＄{5 lt 3 }</td>
		</tr>
		<tr>
			<td>비교(ge : greate than or equal)</td>
			<td><%=5>=3 %></td>
			<td>${5 ge 3 }</td>
			<td>＄{5 ge 3 }</td>
		</tr>
		<tr>
			<td>비교(le : less than or equal)</td>
			<td><%=5<=3 %></td>
			<td>${5 le 3 }</td>
			<td>＄{5 le 3 }</td>
		</tr>
		<tr>
			<td>문자</td>
			<td><%='a' %></td>
			<td>${'a' }</td>
			<td>＄{'a' }</td>
		</tr>
		<tr>
			<td>Boolean</td>
			<td><%=true %></td>
			<td>${true }</td>
			<td>＄{true }</td>
		</tr>
		<% String msg=null; %>
		<tr>
			<td>Null-EL은 null은 없는 값으로 잘 표기함</td>
			<td><%=msg %></td>
<!-- 		문자로 null 반환 -->
<%-- 		<td><%=null %></td> 오류남 --%>
			<td>${null }</td>
<!-- 		null이면 빈값으로 안나옴 -->
			<td>＄{null }</td>
		</tr>
	</table>
</body>
</html>