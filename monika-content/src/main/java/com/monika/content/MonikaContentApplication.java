package com.monika.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.monika.content.dao")
public class MonikaContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonikaContentApplication.class, args);
    }

}
