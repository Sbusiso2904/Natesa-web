package com.example.backend.Signup;

import java.util.Optional;

public class UserService {
   UserRespository userRespo;

    public UserService(UserRespository userRespo) {
        this.userRespo = userRespo;
    }

    public String registerUser(User user){
        Optional<User> existingUserByName = userRespo.findByUsername(user.getName());
        if(existingUserByName.isPresent()){
            return "Username already exists";
        }
        
        Optional<User> existingByEmail = userRespo.findByEmail(user.getEmail());
        if(existingByEmail.isPresent()){
            return "Email already exists!";
        }
       
        saveUser(user);
        return "User registered successfully";
    }


    public User saveUser(User user){
       return userRespo.save(user);
    }
    
}
