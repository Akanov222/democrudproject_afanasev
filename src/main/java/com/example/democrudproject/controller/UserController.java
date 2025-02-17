package com.example.democrudproject.controller;

import com.example.democrudproject.repository.User;
import com.example.democrudproject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> helloWorld() {
        return userService.helloWorld();
    }
}
