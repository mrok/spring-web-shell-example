package com.mrok.example.controller;

import com.mrok.example.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    Greeter greeter;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return greeter.getText();
    }
}
