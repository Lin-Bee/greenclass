package com.green.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//db와 연동될거니까 db테이블명과
//컬럼변수명 맞춰주기
@Setter
@Getter
@ToString
public class BoardDTO {
	private int boardNum;
	private String title;
	private String content;
	private String writer;
}
