package com.user.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amqp")
public class AmqpController extends BaseController{
	@Autowired
	AmqpTemplate amqpTemplate;
	
	@GetMapping("/send")
	public ModelMap send() {
		amqpTemplate.convertAndSend("fanoutExchange","dd","i am user");
		return renderSuccess();
	}
	
}