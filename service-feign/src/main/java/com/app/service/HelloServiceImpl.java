package com.app.service;

import org.springframework.stereotype.Component;

import com.app.dao.HelloService;

@Component
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHi(String name) {
		return "sorry "+name;
	}
	
}