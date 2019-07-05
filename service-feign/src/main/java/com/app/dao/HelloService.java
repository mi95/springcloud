package com.app.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.HelloServiceImpl;

@FeignClient(value = "service-hi",fallback = HelloServiceImpl.class)
public interface HelloService{
	@GetMapping("/hi")
	public String sayHi(String name);
}