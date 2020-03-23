package com.example.springboot.service.impl;

import com.example.springboot.common.MD5Utils;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public int insert(String username, String password, Integer status) {
        String pwd = MD5Utils.md5Encode(password, "");
        long l = System.currentTimeMillis();
        String token = String.valueOf(l);
        return userMapper.insert(username,pwd,token,status);
    }
}
