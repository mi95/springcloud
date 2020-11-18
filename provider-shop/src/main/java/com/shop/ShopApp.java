package com.shop;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@EnableSwagger2Doc
@SpringBootApplication
@PropertySource(value = {"file:config/config.properties"})
@MapperScan({"com.shop.mapper", "com.shop.mapper.generate"})
public class ShopApp {

    public static void main(String[] args) {
        SpringApplication.run(ShopApp.class, args);
        System.out.println("comlete....");
    }
}
