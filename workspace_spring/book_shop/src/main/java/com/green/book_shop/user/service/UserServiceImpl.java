package com.green.book_shop.user.service;

import com.green.book_shop.user.dto.UserDTO;
import com.green.book_shop.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	private UserMapper userMapper;

	public UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	//	회원 목록만 > 디테일은 따로
	@Override
	public List<UserDTO> selectUserList() {
		return userMapper.selectUserList();
	}

	@Override
	public boolean insertUser(UserDTO userDTO) {
		boolean result = false;
		//아이디가 중복이다 > 조회된 데이터가있다
		//아이디가 중복이 아니면 > 조회데이터는 null이다

		String checkId = userMapper.isUsableUserId(userDTO.getUserId());
		String checkTel = userMapper.isUsableUserTel(userDTO.getUserTel());

		if (checkTel == null && checkId == null){
			userMapper.insertUser(userDTO);
			result = true;
		}

		return result;
	}

	@Override
	public UserDTO selectLogin(UserDTO userDTO) {
		return userMapper.selectLogin(userDTO);
	}

}
