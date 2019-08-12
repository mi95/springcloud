package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
public class AppOrder {
	
	public static void main(String[] args) {
		SpringApplication.run(AppOrder.class, args);
		System.out.println("comlete....");
	}
}
