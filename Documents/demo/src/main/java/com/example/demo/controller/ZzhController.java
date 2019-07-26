package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZzhController {
    @RequestMapping("/id/{id}")
    public String index(@PathVariable String id){
        System.out.print(id);
        return id;
    }

    @RequestMapping("/{id}")
    public String test(@PathVariable String id){
        return id+" success";
    }

    @RequestMapping("/getuser")
    public User getUser(){
        User user = new User();
        user.setName("小明");
        user.setPassword("******");
        return user;
    }

}
