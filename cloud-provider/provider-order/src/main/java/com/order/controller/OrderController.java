package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.common.RedisUtil;

@RestController
public class OrderController {
	@Autowired
	RedisUtil redisUtil;
	
	@GetMapping("/test")
	private void test() {
		redisUtil.set("xx", "xx");
		System.out.println(redisUtil.get("xx"));
	}
}
