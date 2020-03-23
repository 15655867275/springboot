package com.example.springboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class handlerException {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> globleExceptionHandler(){//拦截全局异常
        Map<String,Object> result = new HashMap<>();
        result.put("code","500");
        result.put("msg","系统异常错误");
        return result;
    }
}
