package com.user.config;

import com.user.interceptor.JwtInterceptor;
import com.user.interceptor.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public UserInterceptor myInterceptor() {
        return new UserInterceptor();
    }

    @Bean
    public JwtInterceptor jwtInterceptor() {
        return new JwtInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有请求
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**").excludePathPatterns("");
        registry.addInterceptor(jwtInterceptor()).addPathPatterns("/**").excludePathPatterns("");
    }

}