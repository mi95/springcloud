package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
@EnableFeignClients("com.user.service")
public class AppUser {
	
	public static void main(String[] args) {
		SpringApplication.run(AppUser.class, args);
		System.out.println("comlete....");
	}
}
