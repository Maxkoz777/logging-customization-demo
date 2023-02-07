package com.example.loggingcustomizationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LoggingCustomizationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggingCustomizationDemoApplication.class, args);
    }

}
