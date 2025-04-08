package com.green.security_exam.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.green.security_exam.dto.MemberDTO;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;

@Slf4j
//UsernamePasswordAuthenticationFilter는 스프링 시큐리티의 로그인 로직의 시작
//UsernamePasswordAuthenticationFilter 클래스를 상속받아 새로운 클래스르만듬
//UsernamePasswordAuthenticationFilter 기능을 우리 취향으로 변경하여 사용하겠다는 의미로 상속받음
public class LoginFilter extends UsernamePasswordAuthenticationFilter {

	private final AuthenticationManager authenticationManager;

	//생성자주입을통해 매개변수로 가져오면 우리가 만든 변수에 넣어주는 식으로되어있어서
	//약속된 프로토콜임
	public LoginFilter(AuthenticationManager authenticationManager){
		this.authenticationManager = authenticationManager;

		setFilterProcessesUrl("/users/login"); //로그인 요청URL 변경
		setUsernameParameter("memEmail"); //이코드없으면 username으로 전달
		setPasswordParameter("memPw"); //이코드없으면 password로 전달됨

	}

	//attemptAuthentication() 매서드는 로그인 요청이 발생하는 가장 처음 호출됨
	//로그인 요청은 기본적으로 '/login' 이다. (post)
	@Override //얘는 아이디랑 비번이 받음
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		log.info("loginfilter클래스의 attemptAuthenrication()매서드실행");

		//입력한 아이디 및 비번 받기
		MemberDTO dto = new MemberDTO();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			ServletInputStream inputStream = request.getInputStream();
			String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
			dto = objectMapper.readValue(messageBody, MemberDTO.class);
		}catch (Exception e){
			throw new RuntimeException(e);
		};

		log.info("전달받은 아이디:"+dto.getMemEmail());
		log.info("전달받은 비번:"+dto.getMemPw());

		return super.attemptAuthentication(request, response);
	}
}
