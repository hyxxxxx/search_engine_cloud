package com.cloud.searchengine.consumer.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumerEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerEngineApplication.class, args);
    }

}
