package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

//	private ItemMapper itemMapper;
//	public ItemServiceImpl(ItemMapper itemMapper) {
//	this.itemMapper = itemMapper;
//	}
//지금까지 생성자 주입을 통해서 진행하고있었으나 다른 방법으로 진행
	private final ItemMapper itemMapper;

// final 생성자 생성후 @RequiredArgsConstructor 가 붙으면
// 의존성주입을 위한 final생성자의 컨스트럭쳐가 자동으로 생성되어
// 아래의 내용이 자동생성되므로
//	@Autowired
//	public ItemServiceImpl(ItemMapper itemMapper) {
//		this.itemMapper = itemMapper;
//	}
// 삭제한다
// 관련내용 ★★★ spring 3번 페이지 ★★★


	@Override
	public List<ItemDTO> allItemList() {
		return itemMapper.allItemList();
	}

	@Override
	public ItemDTO oneItemList(int itemNum) {
		return itemMapper.oneItemList(itemNum);
	}

	@Override
	public int insertItem(ItemDTO itemDTO) {
		return itemMapper.insertItem(itemDTO);
	}

	@Override
	public int updateItem(ItemDTO itemDTO) {
		return itemMapper.updateItem(itemDTO);
	}
}
