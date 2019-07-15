package com.msg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.msg.mapper")
@PropertySource(value={"file:config/config.properties"})
public class AppMsg {
	
	public static void main(String[] args) {
		SpringApplication.run(AppMsg.class, args);
		System.out.println("comlete....");
	}
}
