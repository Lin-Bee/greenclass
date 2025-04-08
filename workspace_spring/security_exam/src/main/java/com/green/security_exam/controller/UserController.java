package com.green.security_exam.controller;

import com.green.security_exam.dto.MemberDTO;
import com.green.security_exam.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@Slf4j //db보기
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

	private final UserService userService;
	private final PasswordEncoder passwordEncoder;//securityconfig에서 만들어둠

	//비밀번호 암호화 연습 메서드
	@GetMapping("/test")
	public void testEncode(){
		String str1 = "java";
		String str2 = "java";

		//암호화
		String encodedStr1 = passwordEncoder.encode(str1);
		String encodedStr2 = passwordEncoder.encode(str2);

		System.out.println("암호화된 str1 = " + encodedStr1);
		System.out.println("암호화된 str2 = " + encodedStr2);

		//matches(원본문자열, 암호화된 문자열)
		System.out.println(passwordEncoder.matches(str1,encodedStr1));
		System.out.println(passwordEncoder.matches("java",encodedStr1));
		System.out.println(passwordEncoder.matches("python",encodedStr1));
	}

	//회원가입
	@PostMapping("/join")
	public ResponseEntity<?> join(@RequestBody MemberDTO memberDTO){
		log.info("회원가입 기능실행");

		String encodedPw = passwordEncoder.encode(memberDTO.getMemPw());
		memberDTO.setMemPw(encodedPw);

		userService.join(memberDTO);

		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
