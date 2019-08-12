package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RefreshScope
//@PropertySource(value={"file:config/config.properties"})
public class AppConfigClient {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfigClient.class, args);
		System.out.println("comlete....");
	}
	
//	 @Bean
//	    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//	        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//	        c.setIgnoreUnresolvablePlaceholders(true);
//	        return c;
//	    }
	
	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		
		return foo;
	}
}
