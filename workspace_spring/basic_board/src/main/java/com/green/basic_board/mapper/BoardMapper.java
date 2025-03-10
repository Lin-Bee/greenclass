package com.green.basic_board.mapper;

import com.green.basic_board.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// ここは 인터페이스가 board-mapper.xml 파일의 쿼리를 실행する
//쿼리-실행 인터페이스 : @Mapper 이노테이션을 사용해야함
//해당 Mapper 인터페이스와 연결될 xml 파일에 namespace부분에 연결할 명을 패키지포함
// ㄴ resources > mapper > board-mapper.xml 부분확인
@Mapper //어노테이션이 붙은 인터페이스를 쿼리 실행 메서드가 존재하는 파일임을인지
        //자동으로 객체 생성되어있음
public interface BoardMapper {
	/*
	 1. 메서드명은 반드시 xml의 쿼리id와 일치해야함
	 2. 메서드의 (매개변수); 는 실행할 쿼리의 빈 값을 채울 용도로 사용.
	 3. 메서드의 리턴타입은 쿼리 실행 결과 전체를 자바로 가져올 수 있는 자료형
		 */
	//게시글 목록 조회 쿼리를 실행시킬 메서드
	public List<BoardDTO> selectBoardList();

	//하나의 게시글 정보를 조회하는 쿼리를 실행시킬 메서드
	public BoardDTO getBoard(int boardNum);

	//게시글 등록 쿼리 실행 메서드 < 영향을받은 행의수
	public int insertBoard(BoardDTO boardDTO);


}
