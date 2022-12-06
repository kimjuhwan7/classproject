package com.first.app;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.first.app.mapper")
public class FirstBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstBootAppApplication.class, args);
    }

}
