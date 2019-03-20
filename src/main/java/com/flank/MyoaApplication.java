package com.flank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//myljfsfsf
@SpringBootApplication
@MapperScan("com.flank.mapper")
public class MyoaApplication {
    public static void main(String[] args){
        SpringApplication.run(MyoaApplication.class, args);
    }

}
