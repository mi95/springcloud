package com.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msg.amqp.AmqpProducer;

@RestController
@RequestMapping("/amqp")
public class AmqpController extends BaseController{
	@Autowired
	AmqpProducer amqpProducer;
	
	@GetMapping("/send")
	public ModelMap sendMsg(){
		amqpProducer.send();
		return renderSuccess();
	}
	
	@GetMapping("/fanoutSend")
	public ModelMap fanoutSend(){
		amqpProducer.fanoutSend();
		return renderSuccess();
	}
}