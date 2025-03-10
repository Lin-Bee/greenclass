package com.green.react_shop.mapper;

import com.green.react_shop.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
	public List<OrderDTO> allOrderList(); //전체보기
//	public OrderDTO oneOrderList(int itemNum); //하나보기
	public int insertOrder(OrderDTO orderDTO); //넣기
}
