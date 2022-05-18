package com.example.educational;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.educational.mapper")
public class EducationalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationalApplication.class, args);
    }

}
