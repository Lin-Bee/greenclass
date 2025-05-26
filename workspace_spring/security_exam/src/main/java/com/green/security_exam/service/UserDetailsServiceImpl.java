package com.green.security_exam.service;


import com.green.security_exam.dto.CustomUserDetails;
import com.green.security_exam.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
					// UserDetailsService  만들어져있는 아이 사용
	private final UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("UserDetailsServiceImpl에서 실행한 loadUserByUserName()매서드실행");

		//검증을 하기위해 DB의 ID와 비번도 조회회서 검증하려함
		MemberDTO dto = userService.getMemberForLogin(username);
		if(dto == null){
			log.info("=======일치하는 아이디 없음==========");
			//401 상태코드 반환
			throw new UsernameNotFoundException("없는 아이디 : " + username);
		}

		return new CustomUserDetails(dto);
	}
}
