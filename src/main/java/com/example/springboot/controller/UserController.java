package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户所有信息
     * @return
     */
    @RequestMapping("/select/user")
    public List<User> selectUsers(){
        List<User> users = userService.selectUser();
        return users;
    }

    /**
     * 插入用户信息
     * @param username
     * @param password
     * @param status
     * @return
     */
    @RequestMapping("/insert/user")
    public String insertUser(String username, String password, Integer status){
        userService.insert(username,password,status);
        return "success";
    }


}
