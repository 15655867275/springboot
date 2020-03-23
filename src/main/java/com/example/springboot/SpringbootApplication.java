package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@ComponentScan(value = {"com.example.springboot.controller","com.example.springboot.exception","com.example.springboot.entity","com.example.springboot.service"})
@MapperScan(value = "com.example.springboot.mapper")
@SpringBootApplication
//@EnableAsync//异步调用
//@EnableCaching//缓存开启
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){//打包成war包
        return builder.sources(SpringbootApplication.class);
    }*/

}
