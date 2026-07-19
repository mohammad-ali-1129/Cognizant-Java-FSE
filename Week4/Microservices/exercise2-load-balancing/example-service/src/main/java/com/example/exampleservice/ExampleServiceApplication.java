package com.example.exampleservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExampleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleServiceApplication.class, args);
    }

    @RestController
    static class GreetingController {

        @Value("${server.port}")
        private String port;

        // Hit directly on 8081/8082, or via the gateway at /loadbalanced/greeting
        @GetMapping("/loadbalanced/greeting")
        public String greeting() {
            return "Hello from example-service instance running on port " + port;
        }
    }
}
