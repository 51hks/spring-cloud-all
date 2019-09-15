package com.gupaoedu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;


public class EurekaServerBootstrap {

    @EnableAutoConfiguration
    @EnableEurekaServer
    @ComponentScan(basePackages =  "com")
    public static class EurekaServerConfiguration {
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfiguration.class, args);
    }
}
