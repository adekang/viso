package com.example.viso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.viso.mapper")
public class VisoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VisoApplication.class, args);
    }

}
