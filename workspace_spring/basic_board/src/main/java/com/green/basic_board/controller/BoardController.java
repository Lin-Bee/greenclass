package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import com.green.basic_board.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
	private BoardService boardService;

	@Autowired // 만약 클래스안에 생성자가 1개만있으면 생략해도 ㄱㅊ
	public BoardController(BoardService boardService){
		this.boardService = boardService;
	}

	//게시글 목록조회 기능을 제공하는 REST API
	@GetMapping("") //localhost:8080/boards
	public List<BoardDTO> getBoardList(){
		System.out.println("게시글목록조회 시작");
		List<BoardDTO> boardList= boardService.selectBoardList();
		return boardList;
	}

	//게시글 하나의 정보를 제공하는 REST API
	@GetMapping("/{boardNum}") //localhost:8080/boards/{boardNum}
	public BoardDTO getBoardCont(@PathVariable("boardNum") int boardNum){
		System.out.println("넣은 게시글조회 시작");
		return boardService.getBoard(boardNum);
	}

	@PostMapping("") ////localhost:8080/boards/
	public int insertBoard(@RequestBody BoardDTO boardDTO){
		System.out.println(boardDTO);
		return boardService.insertBoard(boardDTO);
	}

}
