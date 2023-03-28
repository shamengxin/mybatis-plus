package com.shamengxin.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.shamengxin.mybatisplus.mapper")
@SpringBootApplication
public class Ch01MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch01MybatisplusApplication.class, args);
    }

}
