package com.spssm.ssmspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.spssm.ssmspringboot.mapper")//告诉mapper所在的包名
public class SsmspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmspringbootApplication.class, args);
    }
}
