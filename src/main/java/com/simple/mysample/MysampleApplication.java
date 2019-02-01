package com.simple.mysample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simple.mysample.dao")
public class MysampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysampleApplication.class, args);
    }
}

