package com.green.book_shop.user.controller;

import com.green.book_shop.user.dto.UserDTO;
import com.green.book_shop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
	private final UserService userService;

	@GetMapping("")
	public List<UserDTO> selectUserList(){
		return userService.selectUserList();
	};

	@PostMapping("")
	public boolean insertUser(@RequestBody UserDTO userDTO){
		return userService.insertUser(userDTO);
	};

	//get 방식으로 현재 사용하지 않는 이유
	//@PathVariable, @RequestParam으로 전달되는 데이터는
	//url이 노출됨 => 아이디, 비번 유출심함
//	@PostMapping("/login")
//	public UserDTO selectLogin(@RequestBody UserDTO userDTO){
//		return userService.selectLogin(userDTO);
//	};
	@GetMapping("/login")
	public UserDTO selectLogin(UserDTO userDTO){
		// loginUser가 null 이 아니면 로그인 가능
		// loginUser가 null 이면 로그인 불가능
		UserDTO loginUser = userService.selectLogin(userDTO);
		return loginUser;
	};
}
