package com.green.security_exam.filter_back;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean<Filter1> filterRegistrationBean(){
		FilterRegistrationBean<Filter1> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new Filter1());
		registrationBean.addUrlPatterns("/*");
		registrationBean.setOrder(1); // 실행순서 숫자가 낮을수록 먼저실행

		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean<Filter2> filterRegistration(){
		FilterRegistrationBean<Filter2> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new Filter2());
		registrationBean.addUrlPatterns("/*");
		registrationBean.setOrder(0); // 실행순서 숫자가 낮을수록 먼저실행

		return registrationBean;
	}
}
