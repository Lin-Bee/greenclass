package com.green.security_exam.filter_back;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter1 implements Filter {


	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("filter 클래스의 dofillter실행");
		filterChain.doFilter(servletRequest,servletResponse);
	}
}
