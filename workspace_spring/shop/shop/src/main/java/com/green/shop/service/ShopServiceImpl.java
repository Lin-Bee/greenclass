package com.green.shop.service;

import com.green.shop.dto.ShopDTO;
import com.green.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
//이제 여기서 실행할꺼임 여기가 java영역이라고 보면됨
public class ShopServiceImpl implements ShopService {
	// mapper에서 만들어둔 실행가능한기능 가져오기위해 선언해줌
	private ShopMapper shopMapper;

	@Autowired
	//ShopServiceImpl 은 mapper에서 불러온 기능을 활용할 영역이라는걸 선언
	public ShopServiceImpl (ShopMapper shopMapper){
		this.shopMapper = shopMapper;
	}

	@Override
	public int insertItem(ShopDTO shopDTO) {
		System.out.println("넣기");
		// java와 동일함 > class파일이니깐
		// int a = shopMapper.inserItem(shopDTO); return a;
		// int로 반환할거니까 int {변수}는 shopMapper로 불러온.특정함수(매개변수) 임
		return shopMapper.insertItem(shopDTO);
		// 이제 그냥 실행여부라서 return해주면됨
	}

	@Override
	public List<ShopDTO> showItemList() {
		System.out.println("전체보기");
		//List<ShopDTO> 는 가끔 리턴이안되더라 욀꽈
		return shopMapper.showItemList();
	}

	@Override
	public ShopDTO showItemCont(int itemCode) {
		System.out.println("특정넘버보기");
		return shopMapper.showItemCont(itemCode);
	}

	@Override
	public void deletItem(int itemCode) {
		System.out.println("지우기");
		shopMapper.deletItem(itemCode);
	}

	@Override
	public void updateItem(ShopDTO shopDTO) {
		System.out.println("업데이트하기");
		shopMapper.updateItem(shopDTO);
	}
}
