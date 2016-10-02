package com.mrok.example.service;


import org.springframework.stereotype.Component;

@Component
public class Greeter {

    public String getText() {
        return "Hello stranger";
    }
}
