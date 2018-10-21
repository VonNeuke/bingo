package com.liuke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.liuke.dao")
public class BingoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BingoApplication.class, args);
    }
}
