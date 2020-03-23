package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${name}")//读取配置文件内容注解
    private String name;

    @RequestMapping("/test")
    public String test(String name){
        return "test:"+name;
    }

    @RequestMapping("/test1")
    public String test1(){
        int k = 1/0;
        return "test1"+k;
    }

    @RequestMapping("/prodorDev")
    public String prodorDev(){
        return "name:"+name;
    }
}
