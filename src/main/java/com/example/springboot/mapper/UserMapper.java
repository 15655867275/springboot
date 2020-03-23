package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> selectUser();

    @Insert("INSERT INTO USER(username, password, token, status) VALUES(#{username}, #{password}, #{token}, #{status})")
    int insert(@Param("username") String username, @Param("password") String pwd,@Param("token") String token, @Param("status") Integer status);

}
