package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/myendpoint")
    public String getEndpoint() {
        // Handle GET request logic
        return "GET request successful";
    }

    @PostMapping("/myendpoint")
    public String postEndpoint() {
        // Handle POST request logic
        return "POST request successful";
    }
}
