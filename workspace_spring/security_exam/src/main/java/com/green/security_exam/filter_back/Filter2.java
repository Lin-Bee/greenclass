package com.green.security_exam.filter_back;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter2 implements Filter{
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("filter2 클래스이 dofilter()실행");
		filterChain.doFilter(servletRequest,servletResponse);
	}
}
