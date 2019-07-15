package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.PropertySource;

@EnableZuulProxy
@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
public class AppZuul {
	
	public static void main(String[] args) {
		SpringApplication.run(AppZuul.class, args);
		System.out.println("comlete....");
	}
}
