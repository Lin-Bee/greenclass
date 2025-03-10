package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
@Slf4j
public class ItemController {

	//1. 모든 상품을 조회하는
	@GetMapping()
	public void selectAllItem(){
		log.info("상품전체조회");
	}

	//2.상품하나를 조회하는
	@GetMapping("/{itemCode}")
	public void selectItem(@PathVariable("itemCode") int itemCode){
		log.info("상품조회");
		log.info("itemCode = "+ itemCode);
	}

	//3.상품하나를 등록하는
	@PostMapping()
	public void insertItem(@RequestBody ItemDTO itemDTO){
		log.info("상품등록 ");
		log.info("itemDTO = "+ itemDTO); // 등록확인용
		log.info(itemDTO.toString()); // 등록확인용
	}

	//4.상품하나를 삭제하는
	@DeleteMapping("/{itemCode}")
	public void deleteItem(@PathVariable("itemCode") int itemCode){
		log.info("삭제코드실행 ");
		log.info("itemCode = "+ itemCode);
	}
	//5.상품하나의 이름,가격,색상을 변경하는
	@PutMapping("/{itemCode}")
	public void updateItem(@PathVariable("itemCode")int itemCode,
												 @RequestBody ItemDTO itemDTO){
		log.info("변경 고고다");
	}
}
