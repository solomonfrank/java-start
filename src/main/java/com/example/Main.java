package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// @SpringBootConfiguration // this file can also be use as configuration to create beans
// @ComponentScan
// @EnableAutoConfiguration
@SpringBootApplication // this is combination of @SpringBootConfiguration + @ComponentScan +
// @PropertySource("classpath:abc.properties")
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        // SpringApplication springApplication = new SpringApplication(Main.class);
        ConfigurableApplicationContext container = SpringApplication.run(Main.class, args);
        College college = container.getBean(College.class);
        college.displayName();
    }

    @Bean
    public College college() {
        return new College();
    }
}