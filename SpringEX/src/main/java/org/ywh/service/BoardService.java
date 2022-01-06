package org.ywh.service;

import java.util.ArrayList;

import org.tae.domain.BoardDTO;

public interface BoardService {
	 // 게시판 글쓰기 설계 
	   public void write(BoardDTO board);
	   // 게시판 목록 리스트 
	   public ArrayList<BoardDTO> list();	  
	   // 게시판 상세페이지
	   public BoardDTO detail(BoardDTO board);
	   // 게시판 수정페이지
	   // 게시판 삭제 페이지 
	   
	   
	}

