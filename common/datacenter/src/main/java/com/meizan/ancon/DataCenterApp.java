package com.meizan.ancon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DataCenterApp {

    public static void main(String[] args) {
        SpringApplication.run(DataCenterApp.class, args);
    }

}