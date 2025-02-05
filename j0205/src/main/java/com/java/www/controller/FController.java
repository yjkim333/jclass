package com.java.www.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.java.www.service.BService;
import com.java.www.service.BServiceBList;
import com.java.www.service.MService;
import com.java.www.service.MServiceMember;
@WebServlet("*.do")
public class FController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doAction호출");
		
		request.setCharacterEncoding("utf-8"); //한글처리
		
		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		BService bservice = null;
		MService mservice = null;
		
		if(page.equals("/index.do")) {
			System.out.println("메인페이지 연결");
			url = "index.jsp";
		}else if(page.equals("/login.do")){
			System.out.println("로그인페이지 연결");
			url = "login.jsp";
		}else if(page.equals("/memberInput.do")){
			System.out.println("회원가입페이지 연결");
			url = "memberInput.jsp";
		}else if(page.equals("/logout.do")){
			System.out.println("로그아웃페이지 연결");
			url = "logout.jsp";
		}else if(page.equals("/bList.do")){
			System.out.println("게시판리스트페이지 연결");
			// 전체 게시글 가져오기
			BService bService = new BServiceBList();
			bService.execute(request, response); // request 에 list 데이터 담겨서 넘어옴.
			url = "bList.jsp";
			
		}else if(page.equals("/member.do")){
			System.out.println("전체회원 정보페이지 연결");
			mservice = new MServiceMember();
			mservice.execute(request, response);
			url = "member.jsp";
		}
		
		
		System.out.println("url : "+url);
		// response.sendRedirect(url); // sendRedirect에는 request,response에 데이터를 태워서 보낼 수 없음.
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출");
		doAction(request, response);
	}

}
