package com.example.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringBootMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
        System.out.println("springboot Start");
    }

}
