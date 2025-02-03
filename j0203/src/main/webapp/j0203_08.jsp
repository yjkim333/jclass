<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>page</title>
	</head>
	<body>
	<%
		out.println("서버 : "+request.getServerName()+"<br/>");
		out.println("ip주소 : "+request.getRemoteAddr());
		out.println("url : "+request.getRequestURL());
		out.println("uri : "+request.getRequestURI());
	%>
	</body>
</html>