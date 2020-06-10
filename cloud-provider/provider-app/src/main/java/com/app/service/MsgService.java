package com.app.service;

import com.app.service.impl.MsgServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-msg", fallback = MsgServiceImpl.class)
public interface MsgService {

    @PostMapping("/msg/msg")
    public String addMsg(@RequestParam Integer userId, @RequestParam String msg);
}