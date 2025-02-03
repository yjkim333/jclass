<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키저장하기</title>
	</head>
	<body>
		<h2>로그인</h2>
		<form action="loginCk.jsp" method="get" name="">
			<label>아이디</label>
			<%
			String idSave = "";
			Cookie[] cooks = request.getCookies();			
			if (cooks!=null){
				for(Cookie c : cooks){
					if(c.getName().equals("cook_id")){
						idSave = c.getValue();
					}
				}
			}
			%>
			<input type="text" name="id" value=<%= idSave %>><br>
			<label>비밀번호</label>
			<input type="text" name="pw"><br>
			<input type="checkbox" id="saveId" name="saveId" value="saveId"  <%if(!idSave.equals("")){ %> checked <%}%>>
			<label for ="saveId">아이디 기억하기</label>
			<br>
			<input type="submit" value="로그인"><br>
		</form>
		
	</body>
</html>