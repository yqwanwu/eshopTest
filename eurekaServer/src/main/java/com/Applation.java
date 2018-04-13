package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//@PropertySource("values.properties")
@EnableEurekaServer
@SpringBootApplication
public class Applation extends SpringBootServletInitializer {

//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
//        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
//        bean.setListener(new InitListener());
//        return bean;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Applation.class, args);
    }
}
