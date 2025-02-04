<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
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
		<%!
		
			Connection conn;
			PreparedStatement pstmt;
			ResultSet rs;
		
		%>
	
		<%
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String uid = "ora_user";
			String upw = "1111";
			
			try{
				Class.forName(driver);
				conn = DriverManager.getConnection(url,uid,upw);
				String sql = "select * from employees";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				out.println("db 접속 <br>");
				
				while(rs.next()){
					int employee_id = rs.getInt("employee_id");
					String emp_name = rs.getString("emp_name");
					out.println("사번 : "+employee_id+", "+"이름 : "+emp_name+"<br>");
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
					
				} catch(Exception e2){
					e2.printStackTrace();
				}
			}
		
		%>
	</body>
</html>