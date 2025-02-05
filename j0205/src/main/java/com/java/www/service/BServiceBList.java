package com.java.www.service;

import java.util.ArrayList;

import com.java.www.dao.BoardDao;
import com.java.www.dto.BoardDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BServiceBList implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// BoardDao 접근
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		BoardDao bdao = new BoardDao();
		list = bdao.bList();
		System.out.println();
		System.out.println();
		for(BoardDto bdto : list) {
			System.out.println("번호 : "+bdto.getBno());
			System.out.println("제목 : "+bdto.getBtitle());
			System.out.println("작성자 : "+bdto.getId());			
			System.out.println("조회수 : "+bdto.getBhit());			
		}
		
		request.setAttribute("list", list);
	}

}
