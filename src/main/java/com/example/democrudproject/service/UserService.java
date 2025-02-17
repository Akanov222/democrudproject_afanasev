package com.example.democrudproject.service;

import com.example.democrudproject.repository.User;
import com.example.democrudproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> helloWorld() {
        return userRepository.findAll();
    }
}
