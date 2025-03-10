package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;


@Getter
@Setter
@ToString
public class OrderDTO extends ItemDTO {
	private int orderNum; //주문번호 < 자동
	private int itemNum; // <불러옴
	private String buyer; //구매자
	private int buyCnt; //구매 수량
	private int buyPrice; //구매 가격 (단가 * 수량)
	private LocalDateTime buyDate; //구매일
	private ItemDTO itemDTO;
}
