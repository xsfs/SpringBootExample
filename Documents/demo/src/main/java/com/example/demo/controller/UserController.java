package com.example.demo.controller;

import com.example.demo.domain.DAO.UserDAO;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public UserDAO getUser() {
        UserDAO user=new UserDAO("aa@126.com", "aa", "aa123456", "aa","123");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }
}