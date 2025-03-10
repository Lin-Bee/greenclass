package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
	public List<BoardDTO> selectList(SearchDTO searchDTO);
	public BoardDTO selectDetail(int boardNum);
	public int insertWrite(BoardDTO boardDTO);
	public int updateCont(BoardDTO boardDTO);
	public int updateCnt(int boardNum);
// mapper에서는 사용하나 service에 사용x
//
	public int deleteCont(int boardNum);
}
