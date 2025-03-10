package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
	private BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	//전체조회는일부 서치하는것과 함께 볼 수 있도록 설정하기
	@GetMapping("")
	public List<BoardDTO> selectList(SearchDTO searchDTO){
		//어노테이션 없는 이유 그냥 SearchDTO로 바로 받아올 수 있게 만들어 둬서임 ㄱ
		return boardService.selectList(searchDTO);
	}


	@GetMapping("/{boardNum}")
	public BoardDTO selectDetail(@PathVariable("boardNum")int boardNum){
		return boardService.selectDetail(boardNum);
	}

	@PostMapping("")
	public int insertWrite(@RequestBody BoardDTO boardDTO){
		return boardService.insertWrite(boardDTO);
	}
	@PutMapping("/{boardNum}")
	public int updateCont(@RequestBody BoardDTO boardDTO,
												@PathVariable("boardNum")int boardNum){
		boardDTO.setBoardNum(boardNum);
		return boardService.updateCont(boardDTO);
	}
	@DeleteMapping("/{boardNum}")
	public int deleteCont(@PathVariable("boardNum") int boardNum){
		return boardService.deleteCont(boardNum);
	}


}
