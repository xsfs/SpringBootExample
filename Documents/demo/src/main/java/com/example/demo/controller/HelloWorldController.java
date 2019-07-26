package com.example.demo.controller;

import com.example.demo.Config.NeoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloworld(){
        return "hello world";
    }

    @Autowired
    NeoProperties neoProperties;

    @RequestMapping("/hell")
    public String get(){

        return neoProperties.getTitle();
    }
}
