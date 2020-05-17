package com.example.springboot.common;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;


public interface BaseDao {

    /*
    @InsertProvider 自定义sql封装
     */
    @InsertProvider(type = BaseProvider.class, method = "save")
    void save(@Param("oj")Object oj,@Param("table") String table);
}
