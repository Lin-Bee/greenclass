package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;

import java.util.List;

public interface OrderService {
	public List<OrderDTO> allOrderList();
//	public OrderDTO oneOrderList(int itemNum); //하나보기
	public int insertOrder(OrderDTO orderDTO);
}
