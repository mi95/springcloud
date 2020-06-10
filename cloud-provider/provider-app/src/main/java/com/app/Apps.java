package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"file:config/config.properties"})
//@EnableFeignClients("com.eureka.service")
public class Apps {

    public static void main(String[] args) {
        SpringApplication.run(Apps.class, args);
        System.out.println("comlete....");
    }
}
