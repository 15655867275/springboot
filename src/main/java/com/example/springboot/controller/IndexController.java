package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(ModelMap map){//配置freemarker文件才能访问
        map.addAttribute("name","yanglu");
        map.addAttribute("sex",1);
        List<String> lists = new ArrayList<String>();
        lists.add("1234");
        lists.add("abcd");
        lists.add("5678");
        map.addAttribute("lists",lists);
        return "index";
    }
}
