package com.wyh.think.in.mysql45;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.wyh.think.in.mysql45"})
@MapperScan(basePackages = {"com.wyh.think.in.mysql45"})
@SpringBootApplication
public class ThinkInMysql45Application {

    public static void main(String[] args) {
        SpringApplication.run(ThinkInMysql45Application.class, args);
    }

}
