package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {
	public List<ItemDTO> allItemList ();
	public ItemDTO oneItemList (int itemNum);
	public int insertItem (ItemDTO itemDTO);
	public int updateItem (ItemDTO itemDTO);
}
