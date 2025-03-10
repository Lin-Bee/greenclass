package com.green.react_shop.mapper;

import com.green.react_shop.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardList(int boardNum);

	public List<BoardDTO> joinList();
}
