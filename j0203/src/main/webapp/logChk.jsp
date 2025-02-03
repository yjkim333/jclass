<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<!-- html 주석 - 소스보기에 주석이 보임. -->
	<%-- jsp 주석 - 소스보기에 주석 안보임. --%>
	<!-- 저장 삭제 출력 -->
	<%
		//out.print(request.getParameter("idsave")); // on
		if(request.getParameter("idsave").equals("on")){
			String id = request.getParameter("id");
			Cookie cookie = new Cookie("cook_id",id);
			cookie.setMaxAge(60*20);
			response.addCookie(cookie);
	%>
	<div>저장</div>
	<%}else{
		
		
	%>
	<div>삭제</div>
	<%} %>
	</body>
</html>