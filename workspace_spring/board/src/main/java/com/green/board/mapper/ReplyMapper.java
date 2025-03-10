package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
	public List<ReplyDTO> selectReplyList(int boardNum);
	public int insertReply(ReplyDTO replyDTO);
	public int deleteReply(int replyNum);
}
