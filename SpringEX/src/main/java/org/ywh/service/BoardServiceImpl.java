package org.ywh.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tae.domain.BoardDTO;
import org.tae.mapper.BoardMapper;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardMapper bmapper;
	// 게시판 글쓰기 설계된 것을 구현 
     
		public void write(BoardDTO board) {
			bmapper.write(board);
     }
	 // 게시판 목록리스트  설계된 것을 구현 
		public ArrayList<BoardDTO> list() {
		
		  return bmapper.list();
		}
		// 게시판 목록리스트에서 제목을 클릭 했을 때 내용이 나오는 상세페이지 설계된것을 구현 
		public BoardDTO detail(BoardDTO board) {
			return bmapper.detail(board);
		}
		// 
	
}
