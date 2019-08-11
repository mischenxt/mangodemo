package com.example.mangodemo.admin.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.security.SecurityUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.example.mangodemo.admin.util.SecurityUtils;

/**
 * 登录认证过滤器
 * @author n
 *
 */
public class JwtAuthenticationFilter extends BasicAuthenticationFilter{

	public JwtAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		SecurityUtils.checkAuthentication(request);
		chain.doFilter(request, response);
	}

}
