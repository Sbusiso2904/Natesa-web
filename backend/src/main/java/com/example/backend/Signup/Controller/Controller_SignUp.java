package com.example.backend.Signup.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Signup.User;
import com.example.backend.Signup.UserService;

@RestController
@RequestMapping("/api/auth/signup")
public class Controller_SignUp {
    private final UserService userService;

    public Controller_SignUp(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully!");  
    }
}
