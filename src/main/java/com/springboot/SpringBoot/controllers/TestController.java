package com.springboot.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.message}")
    private String testMessage;
    @GetMapping("/")
    public String test() {
        return testMessage;
    }
}
