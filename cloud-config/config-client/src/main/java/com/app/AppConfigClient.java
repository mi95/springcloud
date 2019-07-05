package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class AppConfigClient {
	
	/**
	 * http://localhost:8881/actuator/bus-refresh
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfigClient.class, args);
		System.out.println("comlete....");
	}
	
	@Value("${foo}")
	String foo;
	
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
}
