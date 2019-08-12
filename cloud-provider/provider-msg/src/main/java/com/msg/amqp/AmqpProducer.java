package com.msg.amqp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmqpProducer{
	@Autowired
	AmqpTemplate amqpTemplate;
	
	public void send() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
		amqpTemplate.convertAndSend("string","send msg:"+format.format(new Date()));
	}
	
	public void fanoutSend() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(date);
        System.out.println("[fanout] send msg:" + dateString);
        // 注意 第一个参数是我们交换机的名称 ，第二个参数是routerKey 我们不用管空着就可以，第三个是你要发送的消息
        amqpTemplate.convertAndSend("fanoutExchange", "", dateString);
    }
}