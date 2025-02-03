<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>page</title>
	</head>
	<body>
		<%! int jj = 0; %> <!-- 선언식 -->
		
		<!-- 스크립트릿 -->
		<% // 자바 프로그래밍 
			for(int i=0;i<10;i++){
				out.println(i+"<br/>");
			}
		%>
		<hr>
		
		<% // 구구단
		for(int i=2;i<10;i++){
			out.println("[ "+i+" 단 ]<br/>");
			for(int j=1;j<10;j++){
				out.println(i+" x "+j+" = "+i*j+"<br/>");
			}
		}
		%>
		<hr>
		<%
		int k = 0;
		while(k<10){
			out.println(k+"<br/>");
			k++;
		}
		
		%>
	</body>
</html>