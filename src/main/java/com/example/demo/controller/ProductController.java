package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private UserService userService;

    @Autowired
    public ProductController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Optional<List<User>> getUsers() {
        return userService.getUsers();
    }
}