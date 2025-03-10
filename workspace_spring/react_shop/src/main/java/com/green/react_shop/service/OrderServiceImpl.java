package com.green.react_shop.service;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
	private OrderMapper orderMapper;

	public OrderServiceImpl(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}
	@Override
	public List<OrderDTO> allOrderList(){
		return orderMapper.allOrderList();
	}



	@Override
	public int insertOrder(OrderDTO orderDTO){
		return orderMapper.insertOrder(orderDTO);
	}
}
