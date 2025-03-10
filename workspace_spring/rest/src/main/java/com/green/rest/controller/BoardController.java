package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

// 너는 컨트롤러이다 restcontroller붙여주기
@RestController
@Slf4j //log되도록
public class BoardController {
	//1. 모든 게시글을 조회하는 기능을 가진 REST API
	//DB를 기준 > select * FROM REST_BOARD;
	@GetMapping("/boards")
	public void showAllBoard(){
		log.info("게시글 목록조회");
		System.out.println("showAllBoard() 실행 전체보여줘");
	}

	//2. 하나의 게시글 정보를 조회하는 기능을 제공하는 REST API
  //DB를 기준으로 SELECT * FROM REST_BOARD WHERE BOARD_NUM = {};
	@GetMapping("/boards/{boardNum}")
	public void detailBoard(@PathVariable("boardNum") int boardNum){
		//boardDTO의 NUM이 PRIMARY값이라서 저친구 먼저 가져오기
		log.info("특정 PRIMARY값 조회해오마");
		log.info("boardNum = "+ boardNum );
		System.out.println("detailBoard() 실행 특정 num값의 게시글보여줘");
	}

	//3. 하나의 게시글을 등록하는 기능을 제공하는 REST API
	//DB를 기준으로 INSERT INTO REST_BOARD VALUES(PRIMARYKEY,"제목","내용","작성자");
	@PostMapping("/boards") //여러개정보 body
	public void insertBoard(@RequestBody() BoardDTO boardDTO){
		System.out.println(boardDTO.toString());
		log.info("boardDTO = "+ boardDTO );
	}
}
