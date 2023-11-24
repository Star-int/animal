package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@MapperScan(basePackages = {"com.dao"})
@SpringBootApplication
public class AnimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnimalApplication.class, args);
    }

}
