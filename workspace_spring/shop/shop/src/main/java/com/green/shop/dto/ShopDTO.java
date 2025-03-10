package com.green.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

//1 여기서 만듬

@Setter
@Getter
@ToString
public class ShopDTO {
	private int itemCode;
	private String itemName;
	private int itemPrice;
	private String seller;
	private String itemIntro;
	private Timestamp regDate;
}
