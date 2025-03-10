package com.green.react_shop.service;

import com.green.react_shop.dto.BoardDTO;
import com.green.react_shop.mapper.OrderMapper;
import com.green.react_shop.mapper.TestMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{
	private TestMapper testMapper;

	public TestServiceImpl(TestMapper testMapper) {
		this.testMapper = testMapper;
	}

	@Override
	public List<BoardDTO> joinList() {
		return testMapper.joinList();
	}
}
