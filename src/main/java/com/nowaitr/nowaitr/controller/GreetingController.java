package com.nowaitr.nowaitr.controller;

import org.springframework.web.bind.annotation.RestController;

import com.nowaitr.nowaitr.service.GreetingService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

    private GreetingService greetingservice;

    public GreetingController(GreetingService greetingservice) {
        this.greetingservice = greetingservice;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingservice.greeting();
    }

}
