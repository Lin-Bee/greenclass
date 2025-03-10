package com.green.react_shop.mapper;

import com.green.react_shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
	public List<ItemDTO> allItemList (); //전체보기
	public ItemDTO oneItemList (int itemNum); //디테일하나보기
	public int insertItem (ItemDTO itemDTO); //작성하기
	public int updateItem (ItemDTO itemDTO); //수정하기

}
