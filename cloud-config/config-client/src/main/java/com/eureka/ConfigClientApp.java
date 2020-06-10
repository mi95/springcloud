package com.eureka;

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
public class ConfigClientApp {

    @Value("${foo}")
    String foo;

//	 @Bean
//	    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//	        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//	        c.setIgnoreUnresolvablePlaceholders(true);
//	        return c;
//	    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp.class, args);
        System.out.println("comlete....");
    }

    @RequestMapping(value = "/hi")
    public String hi() {

        return foo;
    }
}
