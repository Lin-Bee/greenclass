package com.green.react_shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ItemDTO {
	private int itemNum;
	private String itemName;
	private int itemPrice;
	private String seller;
	private String itemIntro;
	private Timestamp regDate;
}
