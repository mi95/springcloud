package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.HelloService;

@RestController
public class HelloController{
	@Autowired
	HelloService helloService;
	@GetMapping("/hi")
	public String sayHi(String name) {
		return helloService.sayHi(name);
	}
}