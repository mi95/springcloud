package com.user.service;

import com.user.service.impl.MsgServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-msg", fallback = MsgServiceImpl.class)
@Service
public interface MsgService {

    @PostMapping("/msg/msg")
    public String addMsg(@RequestParam Integer userId, @RequestParam String msg);
}