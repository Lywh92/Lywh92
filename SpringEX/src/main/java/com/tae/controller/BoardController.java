package com.tae.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tae.domain.BoardDTO;
import org.ywh.service.BoardService;


@Controller
@RequestMapping("board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	@GetMapping("write")
	public void write() {
		System.out.println("board/write");
	}
	@PostMapping("write")
	public String writePost(BoardDTO board) {
		service.write(board);
		System.out.println("write post...." +board);
		return "redirect:/board/list";
	}
	@ GetMapping("list")
	public void list(Model model) {
		System.out.println("board/list");
		model.addAttribute("list",service.list());
	}
	
	// 게시판 목록 리스트에서 제목을 클릭하면...
	@GetMapping("detail")
	public void detail(BoardDTO board,Model model) {
		System.out.println("detail="+board);
		model.addAttribute("detail",service.detail(board));
	}
}
