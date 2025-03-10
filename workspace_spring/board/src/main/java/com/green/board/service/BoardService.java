package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {
	//기능을 메소드로 표현
	public List<BoardDTO> selectList(SearchDTO searchDTO);
	public BoardDTO selectDetail(int boardNum);
	public int insertWrite(BoardDTO boardDTO);
	public int updateCont(BoardDTO boardDTO);
	public int deleteCont(int boardNum);

}
