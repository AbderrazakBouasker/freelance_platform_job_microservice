package com.microservice.job.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/jobs/hello")
    String sayHello() {
        return "Hello World";
    }

}