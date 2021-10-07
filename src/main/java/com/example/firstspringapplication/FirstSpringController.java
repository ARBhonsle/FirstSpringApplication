package com.example.firstspringapplication;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstSpringController {

    // localhost:8080/
    @GetMapping("/")
    public String getMessage() {
        return "First Spring Application";
    }

    // localhost:8080/welcome
    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to First Spring Application";
    }


}
