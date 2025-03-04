package com.aaron.utserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Aaron's Spring Boot Service on UTCS's Server. \uD83D\uDE09";
    }

    @GetMapping("/cd")
    public String cd() {
        return "Github Action for CD is running successfully. Let's Go!!!";
    }
}
