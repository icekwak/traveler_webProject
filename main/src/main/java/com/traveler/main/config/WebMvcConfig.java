package com.traveler.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.traveler.main.jwt.JwtAuthenticationInterceptor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class WebMvcConfig implements WebMvcConfigurer {

	private final JwtAuthenticationInterceptor jwtAuthenticationInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		log.info("Add Jwt Authentication Interceptor");
		
		registry.addInterceptor(jwtAuthenticationInterceptor)
				.addPathPatterns("/api/myinfo", "/api/signout");
	}
	
}
