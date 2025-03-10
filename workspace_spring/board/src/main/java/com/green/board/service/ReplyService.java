package com.green.board.service;

import com.green.board.dto.ReplyDTO;

import java.util.List;

public interface ReplyService {
	public List<ReplyDTO> selectReplyList(int boardNum);
	public int insertReply(ReplyDTO replyDTO);
	public int deleteReply(int replyNum);
}
