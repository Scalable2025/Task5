package com.example.UserMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserMQ.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/sendToCart/{id}")
    public String sendToCart(@PathVariable String id) {
        // Logic to send message to CartMQ
        
        return "Message sent to CartMQ with ID: " + id;
    }


}
