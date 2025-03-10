package com.green.shop.service;

import com.green.shop.dto.ShopDTO;

import java.util.List;

public interface ShopService {
	public int insertItem(ShopDTO shopDTO);

	public List<ShopDTO> showItemList();

	public ShopDTO showItemCont(int itemCode);

	public void deletItem(int itemCode);

	public void updateItem(ShopDTO shopDTO);


}
