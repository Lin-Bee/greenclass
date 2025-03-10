package com.green.react_shop.controller;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
	private OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping("")
	public List<OrderDTO> allOrderList(){
		return orderService.allOrderList();
	}
	@PostMapping("")
	public int insertOrder(@RequestBody OrderDTO orderDTO){
		return orderService.insertOrder(orderDTO);
	}
}
