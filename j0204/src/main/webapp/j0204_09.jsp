<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>데이터베이스 연결</title>
	</head>
	<body>
		<!-- board DB접근해서 정보를 출력하시오. -->
		<%!
			Connection conn;
			PreparedStatement pstmt;
			ResultSet rs;
			DataSource ds;
		%>
		
		<%
		try{
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("ora21");
			String sql = "select * from board";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			out.println("db 접속 <br>");
			
			out.println("번호 제목 내용 작성자 조회수<br>");
			out.println("----------------------------------<br>");
			while(rs.next()){
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				String id = rs.getString("id");
				int bhit = rs.getInt("bhit");
				
				out.println(bno+" "+btitle+" "+bcontent+" "+id+" "+bhit+"<br>");
			}
			
			
		}catch(Exception e){e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e2){e2.printStackTrace();
			}
		}
		
		%>
		
		
		
		
	</body>
</html>