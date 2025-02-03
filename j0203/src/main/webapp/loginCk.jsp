<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>loginCk-쿠키저장</title>
	</head>
	<body>
		<!-- 아이디를 쿠키에 저장 => cook_id에 쿠키값 저장 -->
		<%
			if(request.getParameter("saveId") != null){
				
			String id = request.getParameter("id");
			
			Cookie cookie = new Cookie("cook_id",id);
			cookie.setMaxAge(60*20);
			response.addCookie(cookie);
		%>
		<div><%=id %> 쿠키 저장 완료</div>

		<%}else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		%>
		<div>저장되어있는 cook_id 쿠키 삭제!</div>
		<%} %>
		
		<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	</body>
</html>