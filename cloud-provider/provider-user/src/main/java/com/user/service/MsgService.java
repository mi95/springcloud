package com.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.service.impl.MsgServiceImpl;
@FeignClient(value="service-msg",fallback = MsgServiceImpl.class)
public interface MsgService{
	
	@PostMapping("/msg/msg")
	public String addMsg(@RequestParam Integer userId,@RequestParam String msg);
}