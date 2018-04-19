package com.test.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PriceApplation extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(PriceApplation.class, args);
    }
}
