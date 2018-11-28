package com.god.ares;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.god.ares.dao")
@SpringBootApplication(scanBasePackages = "com.god.ares")
public class AresApplication {

    public static void main(String[] args) {
        SpringApplication.run(AresApplication.class, args);
        System.out.println("This is god Ares");
    }

}
