package com.bridgelabz.helloapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @PostMapping("/hello")
    public String helloPost() {
        return "Hello from BridgeLabz";
    }
}