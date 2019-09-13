package com.yujian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    /**
     * 方法名可以随意定义，参数也是可以随意定义
     * 返回值：要么ModelAndView类型，要么是String,代表的是视图名称（jsp文件名的名称）
     * @param userName
     * @param userPass
     * @return
     */
    @RequestMapping("/login") //原来servlet里面的service方法，可以处理doGet和doPost两种请求
    public String login(@RequestParam String userName, @RequestParam String userPass){
        if("admin".equals(userName)&&"123".equals(userPass)){
            return "success";
        }
        return "failure";
    }
}
