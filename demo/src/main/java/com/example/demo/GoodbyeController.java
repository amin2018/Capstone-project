package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class GoodbyeController {
    @GetMapping("/goodbye")
    public String goodbye() {
        return "Thanks for visiting, goodbye!";
    }
}