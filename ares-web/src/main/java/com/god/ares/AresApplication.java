package com.god.ares;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@MapperScan(basePackages = {"com.god.ares.dao"})
@ImportResource(locations = {"classpath*:spring/spring-bean.xml"})
@SpringBootApplication(scanBasePackages = {"com.god.ares"})
public class AresApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresApplication.class, args);
        System.out.println("This is god Ares");
    }

}
