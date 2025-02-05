package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.java.www.dto.BoardDto;

import javax.naming.Context;
import javax.naming.InitialContext;

public class BoardDao {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<BoardDto> list;
	
	String btitle, bcontent, id;
	int bno,bgroup,bstep,bindent,bhit;
	
	public ArrayList<BoardDto> bList() {
		conn = getConnection(); // db접근
		String sql = "select * from Board";
		list = new ArrayList<BoardDto>();
		try {
			pstmt = conn.prepareStatement(sql); // db접속
			rs = pstmt.executeQuery(); // sql구문실행
			
			while(rs.next()){
				bno = rs.getInt("bno");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				id = rs.getString("id");
				bgroup =rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bhit = rs.getInt("bhit");
				list.add(new BoardDto(bno,btitle,bcontent,id,bgroup,bstep,bindent,bhit));
			}
			
		} catch (Exception e) {e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}
		return list;
	}// bList()
	
	
	
	// 커넥션 메서드
	public Connection getConnection() {
		Connection connection = null;
		try {
			// 커넥션풀에 있는 Connection 객체 가져오기
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("ora21");
			String sql = "select * from board";
			connection = ds.getConnection();
		} catch (Exception e) {e.printStackTrace();}
		return connection;
	}
	
	
	
	
}
