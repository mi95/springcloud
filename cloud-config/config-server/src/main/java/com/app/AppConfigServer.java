package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.PropertySource;

@EnableConfigServer
@SpringBootApplication
@PropertySource(value={"file:config/config.properties"})
public class AppConfigServer {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfigServer.class, args);
		System.out.println("comlete....");
	}
}
