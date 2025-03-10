package com.green.react_shop.controller;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

	private ItemService itemService;

	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("")
	public List<ItemDTO> allItemList() {
		return itemService.allItemList();
	}

	@GetMapping("/{itemNum}")
	public ItemDTO oneItemList(@PathVariable("itemNum")int itemNum) {
		return itemService.oneItemList(itemNum);
	}

	@PostMapping("")
	public int insertItem(@RequestBody ItemDTO itemDTO) {
		return itemService.insertItem(itemDTO);
	}

	@PutMapping("/{itemNum}")
	public int updateItem(@PathVariable("itemNum")int itemNum,
												@RequestBody ItemDTO itemDTO) {
		return itemService.updateItem(itemDTO);
	}

}
