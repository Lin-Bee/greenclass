package com.green.shop.mapper;

import com.green.shop.dto.ShopDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ShopMapper {
	public int insertItem(ShopDTO shopDTO);

	public List<ShopDTO> showItemList();

	public ShopDTO showItemCont(int itemCode);

	public void deletItem(int itemCode);

	public void updateItem(ShopDTO shopDTO);

	//3 맵을통해 어떤서비스할지만들기
}
