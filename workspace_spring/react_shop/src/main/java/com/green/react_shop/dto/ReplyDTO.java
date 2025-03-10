package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ReplyDTO {
	private int replyNum;
	private String replyContent;
	private String replyWriter;
	private LocalDateTime replyRegDate;
	private int boardNum;

}
