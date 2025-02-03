<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Save Cookie</title>
	</head>
	<body>
		<%
			String cookN = request.getParameter("cookN");		
			String cookV = request.getParameter("cookV");
			
			Cookie cookie = new Cookie(cookN,cookV); // 쿠키객체생성
			cookie.setMaxAge(60*60*24*365); // 60초 * 60분 * 24시간 * 365일 (1년) => 쿠키유효시간
			response.addCookie(cookie);
		%>
		<div>
		<%= cookN %>이 저장되었습니다.
		</div>		
		<button onclick="javascript:location.href='./j0203_10.jsp'">페이지 이동</button>
		
	</body>
</html>