package com.example.ehyeon.loginexamplespringBootjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LoginExampleSpringBootJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginExampleSpringBootJavaApplication.class, args);
    }

    @RestController
    public class testController {

        @GetMapping("/")
        public String test() {
            return "Hello World!";
        }
    }
}
