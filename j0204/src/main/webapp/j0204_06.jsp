<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>page</title>
		<style>
			h2{text-align: center;}
			table,th,td{border:1px solid black; border-collapse: collapse;}
			table{width:900px; margin: 20px auto; text-align: center;}
			th{background: #ededed;}
			th,td{height: 40px;}
		</style>
	</head>
	<body>
		<h2>리스트 출력</h2>
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>취미</th>
			</tr>
			<c:forEach items="${list}" var="mem">
				<tr>
					<td>${mem.id}</td>
					<td>${mem.name}</td>
					<td>${mem.hobby}</td>
				</tr>
			</c:forEach>
		</table>
		
		<hr>
		<h2>홍길동 회원정보</h2>
		<form action="">
			<label>아이디</label>
			<input type="text" name="id" value="${list[0].id}"><br>
			<label>이름</label>
			<input type="text" name="name" value="${list[0].name}"><br>
			<label>취미</label><br>
			<input type="checkbox" id="game" name="hobby" value="game" <c:if test="${fn:contains(list[0].hobby,'게임')}">checked</c:if> >
			<label for="game">게임</label>
			<input type="checkbox" id="golf" name="hobby" value="golf" <c:if test="${fn:contains(list[0].hobby,'골프')}">checked</c:if>>
			<label for="golf">골프</label>
			<input type="checkbox" id="swim" name="hobby" value="swim" <c:if test="${fn:contains(list[0].hobby,'수영')}">checked</c:if>>
			<label for="swim">수영</label>
			<input type="checkbox" id="jogging" name="hobby" value="joging" <c:if test="${fn:contains(list[0].hobby,'조깅')}">checked</c:if>>
			<label for="joging">조깅</label>
			<input type="checkbox" id="reading" name="hobby" value="reading" <c:if test="${fn:contains(list[0].hobby,'독서')}">checked</c:if>>
			<label for="reading">독서</label>
			
			
		</form>
		
		
		
	</body>
</html>