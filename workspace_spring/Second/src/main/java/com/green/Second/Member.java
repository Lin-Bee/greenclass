package com.green.Second;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString //tostring
@NoArgsConstructor //기본 생성자
@AllArgsConstructor //모든 변수를 매개변수로 가지는 생성자
@Setter //setter땡기는 자동
public class Member {
	private String id;
	private int age;
	private String pw;
}
