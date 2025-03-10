package com.green.rest.dto;

//post맨에서 작성된 {
										//"memId":"java",
										//"memName":"kim java",
										//"memAge":59,
										//"memTel":"010"
//									}을 받아오기 위해 만든데이터

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO {
	//data transfer object:데이터 전송객체
	private String memId;
	private String memName;
	private int memAge;
	private String memTel;

}
