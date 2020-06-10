package com.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@MapperScan("com.common.mapper")
@PropertySource(value = {"file:config/config.properties"})
public class CommonApp {

    public static void main(String[] args) {
        SpringApplication.run(CommonApp.class, args);
        System.out.println("comlete....");
    }
}
