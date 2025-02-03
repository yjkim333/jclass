<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Delete Cookie</title>
	</head>
	<body>
		<%
			String cookN = request.getParameter("cookN");		
			
			Cookie[] cookies = request.getCookies(); // 모든 쿠키 가져오기
			if(cookies != null){
				for(Cookie cookie : cookies){
					if(cookie.getName().equals(cookN)){
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
				}
				
//				for(int i=0;i<cookies.length;i++){
//					if(cookies[i].getName().equals(cookN)){
//						cookies[i].setMaxAge(0);
//						response.addCookie(cookies[i]);
//					}
//				}
			}
			
		%>
		<div>
		<%= cookN %> 삭제되었습니다.
		</div>		
		<button onclick="javascript:location.href='./j0203_10.jsp'">페이지 이동</button>
		
	</body>
</html>