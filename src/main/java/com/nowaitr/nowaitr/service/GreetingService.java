package com.nowaitr.nowaitr.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greeting() {
        return "Hello from Nowaitr";
    }
}
