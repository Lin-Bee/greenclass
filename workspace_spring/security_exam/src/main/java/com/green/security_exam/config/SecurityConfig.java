package com.green.security_exam.config;

import com.green.security_exam.jwt.LoginFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Slf4j
@Configuration
//configuration 객체생성+ 해당클래스의 설정내용이 들어있음을 알려줌
@EnableWebSecurity
//해당 클래스가 security 설정을 컨트롤할수 있도록 셋팅하는 어노테이션
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig {

	//실제 시큐리티의 인증&인가에 대한 설정 코드를 작성하는 메서드
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationConfiguration authConfig) throws Exception{

		//실제 로그인은 얘가함
		//AuthenticationManager 는스프링시큐리티에서 실제 로그인 검증을 진행하는 객체
		AuthenticationManager authenticationManager = authConfig.getAuthenticationManager();

		//    람다 함수function(() -> {})           실행할 내용
		http.cors(Customizer.withDefaults())//아래설정한 cors내용을 사용하겠다
						.csrf((csrf) -> csrf.disable())
						.formLogin(form->form.disable())
						.httpBasic( basic -> basic.disable())
						.sessionManagement( session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
						.authorizeHttpRequests(auth ->
						//auth.anyRequest().permitAll()
						auth.requestMatchers("/test1").authenticated()
								.requestMatchers("/admin/login").hasRole("ADMIN") // 관리자접속가능
								.requestMatchers("/login").hasAnyRole("MANAGER","ADMIN") //여러권한중 하나라도 가지면 접속가능
								.anyRequest().permitAll()
						);

		//원래 로그인 요청을 받는 usernamePaswordAuthentication Filter 대신
		//d우리가 커스터 마이징한 LoginFilter를 사용하도록 필터교체
		http.addFilterAt(new LoginFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}

	//cors설정
	public CorsConfigurationSource corsConfigurationSource(){
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://localhost:5173"); //REACT에서 스프링으로 접근허용하게따!!
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
			source.registerCorsConfiguration("/**",config);
			return source;
		}

		//비밀번호 암호화 기능을 제공하는 객체생성메서드
	@Bean
	public PasswordEncoder getPassowrdEncoder(){
		return new BCryptPasswordEncoder(); //< 암호화 되는 실제 객체
	}

}
