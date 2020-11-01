package com.example.microservices.service_sample;

import com.example.microservices.IdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication @EnableEurekaClient
public class ServiceSampleApplication {
    public static final String APPLICATION_ID = IdGenerator.uuid();

    public static void main(String[] args) {
        SpringApplication.run(ServiceSampleApplication.class, args);
    }
}