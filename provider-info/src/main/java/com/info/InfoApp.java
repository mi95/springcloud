package com.info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"file:config/config.properties"})
@MapperScan({"com.info.mapper", "com.info.mapper.generate"})
public class InfoApp {

    public static void main(String[] args) {
        SpringApplication.run(InfoApp.class, args);
        System.out.println("complete...");
    }

}
