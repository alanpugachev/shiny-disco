package com.alanpugachev.shinydisco.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String greetings() {
        return "Hello";
    }

    @GetMapping("/auth")
    public String auth() {
        return "aaaa";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
