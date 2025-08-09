package com.nowaitr.nowaitr.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMethodName() {
        return new String("Welcome to Nowaitr");
    }

}
