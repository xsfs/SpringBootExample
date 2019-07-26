package com.example.demo.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NeoProperties {

    @Value("${com.neo.title}")
    String title;

    @Value("${com.neo.description}")
    String descirpyion;

    public String getTitle(){
        return title;
    }

}
