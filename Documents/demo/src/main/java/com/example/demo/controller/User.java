package com.example.demo.controller;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class User {
    String name;
    String password;
    String id;
}
