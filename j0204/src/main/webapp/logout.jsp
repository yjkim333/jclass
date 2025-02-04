<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Logout</title>
	</head>
	<body>
		<%
			session.invalidate();  // 모든 세션종료
			// session.removeAttribute("session_id"); // 특정 세션 종료
			response.sendRedirect("j0204_01.jsp");
		%>
	
	</body>
</html>