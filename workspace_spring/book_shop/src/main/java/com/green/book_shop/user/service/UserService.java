package com.green.book_shop.user.service;

import com.green.book_shop.user.dto.UserDTO;

import java.util.List;

public interface UserService {
	//	회원 목록만 > 디테일은 따로
	public List<UserDTO> selectUserList();

	//	등록 반환 INT
	public boolean insertUser(UserDTO userDTO);

	public UserDTO selectLogin(UserDTO userDTO);
}
