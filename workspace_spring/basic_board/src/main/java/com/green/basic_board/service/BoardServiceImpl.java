package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //< BoardController 의존성주입
//BoardService에 있는거 BoardServiceImpl에 다만들어줘야함
public class BoardServiceImpl implements BoardService{
	private BoardMapper boardMapper;//      │  오 만들어둠
	//조회기능을 실행하기위해 메서드를 불러오기희망  │
	//쓰고싶은 자료형에 대한 객체생성을위해 불러옴    │
	//스프링이라서 new를 사용하지않고 객체생성         │
	//                                                  │
	// 생성자 주입 autowired 를 하는건                  │
	// 매개변수와 spring을 통해 자동생성된 객체를       │
	// 가지고와서 집어넣은 boardMapper이고              │
	//자동으로 연결해달라고하는게 autowired             │
	@Autowired                                   //     │
	public BoardServiceImpl(BoardMapper boardMapper){//├──────┐
		this.boardMapper = boardMapper;             //  │       │
	}                                             // │        │
	                                             // │         │
// ┌────  게시글목록 조회 기능 실행 메서드  ─────┘           │
	@Override //1차 자동생성후 return 조정                      │
	public List<BoardDTO> selectBoardList() {               //   │
		System.out.println("게시글 조회를 시작합니다.");      //    │
		//게시글 목록 조회 쿼리 실행 : mapper의 쿼리실행 시작        │
	  List<BoardDTO> boardList = boardMapper.selectBoardList(); //─┘
		//게시글 목록 조회 쿼리 실행 : mapper의 쿼리실행 종료
		System.out.println("게시글 조회를 완료하였습니다");
		return boardList;
	}

	//하나의 게시글정보 조회
	@Override
	public BoardDTO getBoard(int boardNum) {
		System.out.println("넣은 num의 게시글조회 시작");
		//BoardDTO board = boardMapper.getBoard(boardNum);
		//return board;
		return boardMapper.getBoard(boardNum);
	}

	//게시글 등록 쿼리 등록 기능
	@Override
	public int insertBoard(BoardDTO boardDTO) {
		System.out.println("게시글 등록 쿼리 등록 기능");
		return boardMapper.insertBoard(boardDTO);
	}
}