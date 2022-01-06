package org.tae.mapper;

import java.util.ArrayList;

import org.tae.domain.BoardDTO;

public interface BoardMapper {
			//게시판  구현 
		   public void write(BoardDTO board);
		   public ArrayList<BoardDTO> list();
		   public BoardDTO detail(BoardDTO board);
		   
}		
