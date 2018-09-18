package com.example.web1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DefaultController {

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping("")
    public String index() {
        return "index: " + this.applicationName;
    }

}
