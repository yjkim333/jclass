<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 변수, 흐름제어(for,if,switch), 변수출력에 사용 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
	<%--
	<% if(){ %>
	<%} %>
	--%>	
	<%--
	<c:if test="${ }">
	</c:if>
	--%>
	
	<!-- 변수선언 -->
	<% String sid = "aaa"; %>
	<div>스크립트릿 사용 : <%= sid %></div>
	<hr>
	<c:set var="id" value="ccc" />
	<div>jstl 변수값 : ${ id }</div>
	<c:out value="${ id }" />
	
	<hr>
	<!-- if -->
	<c:if test="${id == 'bbb'}">
		<div>id : bbb</div>
	</c:if>
	<c:if test="${id != 'bbb'}">
		<div>id 값이 bbb가 아닙니다. 정답 : ${id}</div>
	</c:if>
	
	<hr>
	<!-- for -->
	<% for(int i=1;i<10;i++) {}%>
	<c:forEach begin="1" end="10" step="1" var="i">
		<div>i변수값 : ${i}</div>
	</c:forEach>
	
	<hr>
	<!-- choose(switch) -->
	<c:set var="score" value="89"/>
	<div>점수 : ${score} 점</div>
	<c:choose>
		<c:when test="${score>=90}">
			<div>성적 : A</div>
		</c:when>
		<c:when test="${score>=80}">
			<div>성적 : B</div>
		</c:when>
		<c:when test="${score>=70}">
			<div>성적 : C</div>
		</c:when>
		<c:when test="${score>=60}">
			<div>성적 : D</div>
		</c:when>
		<c:otherwise>
			<div>성적 : F</div>
		</c:otherwise>
	</c:choose>
	
	
	
	</body>
</html>