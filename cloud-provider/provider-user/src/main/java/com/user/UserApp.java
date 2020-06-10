package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@PropertySource(value = {"file:config/config.properties"})
@EnableFeignClients("com.user.service")
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
        System.out.println("comlete....");
    }
}
