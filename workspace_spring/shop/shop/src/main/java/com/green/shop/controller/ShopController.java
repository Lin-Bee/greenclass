package com.green.shop.controller;

import com.green.shop.dto.ShopDTO;
import com.green.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//서비스 impl에서 작성해준거 가져오기 > 가져올거니깐
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
// 처음에 못불러온 이유 @service 를 impl에서 불러와줬어야함
// 걍 모르면 일단 둘다 불러가보셈;
// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
// ShopService 도 가져오기
@RestController
@RequestMapping("/items")
public class ShopController {
	//가져온거 service와 동일하게 활용영역 선언하기
	private ShopService shopService;

	@Autowired
	public ShopController (ShopService shopService){
		//컨트롤러에 샵 서비스를 넣었을때
		this.shopService = shopService;
	}

	@PostMapping("") //post니깐 body shopdto 값을 넣으면 int 실행결과값 1로 리턴됨
	public int insertItem(@RequestBody ShopDTO shopDTO){
		System.out.println("어디서 문제인지 찾아보자");
		System.out.println(shopDTO.toString());
		//map > service까지는 잘되고있음 넣기도 떴으니깐
		return shopService.insertItem(shopDTO);
	}

	@GetMapping("") //slect
	public List<ShopDTO> showItemList(){
		return shopService.showItemList();
	}

	@GetMapping("/{itemCode}")
	public ShopDTO showItemCont(@PathVariable("itemCode") int itemCode){
		System.out.println("어느놈이냐");
		System.out.println(itemCode);
		return shopService.showItemCont(itemCode);
	}

	@DeleteMapping("/{itemCode}")
	public void deletItem(@PathVariable("itemCode") int itemCode){
		shopService.deletItem(itemCode);
	}

//	@PostMapping("/update")
//	public void updateItem(@RequestBody ShopDTO shopDTO){
//		shopService.updateItem(shopDTO);
//	}

	@PutMapping("/{itemCode}")
	// itemcod를 pathvariavle로 받아서 requestbody로 ShopDTO 를 수정하라
	public void updateItem(@PathVariable("itemCode") int itemCode,
												@RequestBody ShopDTO shopDTO){
		shopDTO.setItemCode(itemCode);
		shopService.updateItem(shopDTO);
	}

	//4 어떤서비스를할지 관제확인

}
