<%@page import="java.net.URLEncoder"%>
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
		// 파라미터로 데이터 전달시 URLEncoder 사용하여 utf-8로 인코딩해줘야함.
		String name = URLEncoder.encode(request.getParameter("name"),"utf-8");
		String sage = request.getParameter("age");
		int age = Integer.parseInt(sage);
		if(age>=20){
			response.sendRedirect("pass.jsp?age="+age+"&name="+name);
		}else{
			response.sendRedirect("fail.jsp?age="+age+"&name="+name);
		}
	%>
	</body>
</html>