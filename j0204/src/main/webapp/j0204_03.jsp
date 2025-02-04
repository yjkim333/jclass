<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>For</title>
	</head>
	<body>
		<div> 시작값 스크립트릿 : <%= request.getParameter("st") %></div>
		<div> 종료값 스크립트릿 : <%= request.getParameter("ed") %></div>
		<div> 시작값 jstl : ${param.st}</div>
		<div> 종료값 jstl : ${param.ed}</div>
		<hr>
		<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
			<div>${i}</div>
		</c:forEach>
	</body>
</html>