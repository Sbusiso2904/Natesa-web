package com.example.backend.Signup.Controller;

import com.example.backend.Signup.BecPos;
import com.example.backend.Signup.NecPos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.Signup.User;
import com.example.backend.Signup.UserService;

@RestController
@RequestMapping("/api/auth/signup")
@CrossOrigin
public class Controller_SignUp {
    private final UserService userService;

    public Controller_SignUp(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody User user) {
        user.setBec(BecPos.CHAIRPERSON);
        user.setRole("");
        user.setNec(NecPos.CHAIRPERSON);
        userService.saveUser(user);
        return ResponseEntity.ok("User registered successfully!");  
    }
}
