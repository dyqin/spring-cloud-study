package com.example.licenseservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LicenseController {

    @Value("${test.testString}")
    private  String testString;

    @RequestMapping("/")
    public String index() {
        return "license index: " + this.testString;
    }

}
