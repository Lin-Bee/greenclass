package com.green.react_shop.controller;

import com.green.react_shop.dto.BoardDTO;
import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import com.green.react_shop.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {
	private TestService testService;

	public TestController(TestService testService) {
		this.testService = testService;
	}
	@GetMapping("/1")
	public List<BoardDTO> joinList(){
		return testService.joinList();
	}
}
