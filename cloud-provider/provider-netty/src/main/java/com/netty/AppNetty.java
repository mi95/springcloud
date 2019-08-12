package com.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
public class AppNetty {
	
	public static void main(String[] args) {
		SpringApplication.run(AppNetty.class, args);
		System.out.println("comlete....");
	}
}
