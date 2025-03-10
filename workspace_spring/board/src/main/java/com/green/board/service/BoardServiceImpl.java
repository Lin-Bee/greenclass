package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

	private BoardMapper boardMapper;

	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	@Override
	public List<BoardDTO> selectList(SearchDTO searchDTO) {
		return boardMapper.selectList(searchDTO);
	}

	@Override
	public BoardDTO selectDetail(int boardNum) {
		boardMapper.updateCnt(boardNum);
		return boardMapper.selectDetail(boardNum);
	}

	@Override
	public int insertWrite(BoardDTO boardDTO) {
		return boardMapper.insertWrite(boardDTO);
	}

	@Override
	public int updateCont(BoardDTO boardDTO) {
		return boardMapper.updateCont(boardDTO);
	}

	@Override
	public int deleteCont(int boardNum) {
		return boardMapper.deleteCont(boardNum);
	}
}
