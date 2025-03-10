package com.green.book_shop.user.mapper;

import com.green.book_shop.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
	//	회원 목록만 > 디테일은 따로
	public List<UserDTO> selectUserList();

//	등록 반환 INT
	public boolean insertUser(UserDTO userDTO);

	//아이디,전화번호 중복체크용
	public String isUsableUserId(String userId);
	public String isUsableUserTel(String userTel);

	//로그인체크
	public UserDTO selectLogin(UserDTO userDTO);

}
