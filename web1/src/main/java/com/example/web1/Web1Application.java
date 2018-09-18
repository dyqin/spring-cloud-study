package com.example.web1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Web1Application {

    public static void main(String[] args) {
        SpringApplication.run(Web1Application.class, args);
    }
}
