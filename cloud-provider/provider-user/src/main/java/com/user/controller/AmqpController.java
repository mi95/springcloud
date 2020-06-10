package com.user.controller;

import com.common.controller.BaseController;
import com.common.pojo.RespBean;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amqp")
public class AmqpController extends BaseController {
    @Autowired
    AmqpTemplate amqpTemplate;

    @GetMapping("/send")
    public RespBean send() {
        amqpTemplate.convertAndSend("fanoutExchange", "dd", "i am user");
        return RespBean.success();
    }

}