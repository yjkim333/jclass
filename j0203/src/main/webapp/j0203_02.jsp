<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>form</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="./FormSend" method="post" name="frm">
			<label>아이디</label>
			<input type="text" name="id" id="id"><br/>
			<label>비밀번호</label>
			<input type="text" name="pw" id="pw"><br/>
			<label>이름</label>
			<input type="text" name="name" id="name"><br/>
			<label>성별</label><br/>
			<input type="radio" name="gender" id="male" value="male">
			<label for = "male">남</label>
			<input type="radio" name="gender" id="female" value="female">
			<label for = "female">여</label><br/>
			<label>취미</label><br/>
			<input type="checkbox" name="hobby" id="game" value="game">
			<label for = "game">game</label>
			<input type="checkbox" name="hobby" id="golf" value="golf">
			<label for = "golf">golf</label>
			<input type="checkbox" name="hobby" id="swim" value="swim">
			<label for = "swim">swim</label>
			<input type="checkbox" name="hobby" id="reading" value="reading">
			<label for = "reading">reading</label><br/>
			<br/>
			<label>전공</label><br/>
			<select name = "major">
				<option value="컴퓨터공학">컴퓨터공학</option>
				<option value="국문학">국문학</option>
				<option value="영문학">영문학</option>
			</select>
			<br/>
			<br/>
			<input type="submit" value="가입하기" />
		</form>
	</body>
</html>