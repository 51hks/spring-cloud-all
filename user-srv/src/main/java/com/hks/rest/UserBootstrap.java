package com.hks.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient

public class UserBootstrap {


    public static void main(String[] args) {
        SpringApplication.run(UserBootstrap.class, args);
    }
}
