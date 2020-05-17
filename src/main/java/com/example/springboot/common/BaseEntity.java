package com.example.springboot.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Data
@Setter
@Getter
@Slf4j//日志注解，不需要log4j的反射技术
public class BaseEntity {

    private Integer id;

    private String name;

    private String pwd;

}
