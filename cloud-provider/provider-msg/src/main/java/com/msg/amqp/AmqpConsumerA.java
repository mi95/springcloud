package com.msg.amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = "fanout.a")
public class AmqpConsumerA{
	@Autowired
	AmqpTemplate amqpTemplate;
	
	@RabbitHandler
	public void recieved(String msg) {
		System.out.println("[fanout.a]recieved msg:"+msg);
	}
}