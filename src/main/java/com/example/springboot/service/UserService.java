package com.example.springboot.service;

import com.example.springboot.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectUser();

    int insert(String username, String password, Integer status);
}
