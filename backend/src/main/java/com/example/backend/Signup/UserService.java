package com.example.backend.Signup;

import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public class UserService {
   UserRespository userRespo;

    public UserService(UserRespository userRespo) {
        this.userRespo = userRespo;
    }

//    public String registerUser(User user){
//        Optional<User> existingUserByName = userRespo.findByUsername(user.getName());
//        if(existingUserByName.isPresent()){
//            return "Username already exists";
//        }
//
//        Optional<User> existingByEmail = userRespo.findByEmail(user.getEmail());
//        if(existingByEmail.isPresent()){
//            return "Email already exists!";
//        }
//
//        saveUser(user);
//        return "User registered successfully";
//    }

    public String resetPassword(String email, String newPassword) {
        Optional<User> userOptional = userRespo.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setPassword(newPassword);
            userRespo.save(user);
            return "Password reset successful!";
        } else {
            return "User with this email does not exist.";
        }
    }


    public User saveUser(User user){
       return userRespo.save(user);
    }

    public boolean logIn(String email, String password){
        boolean result = false;
        Optional<User> findUserByEmail = userRespo.findByEmail(email);
        if(findUserByEmail.isPresent()){
            User user = findUserByEmail.get();
           if(user.getEmail().equals(email)){
                result = true;
                System.out.println("Login successful");
           }
           else{
            return result;
           }
        }

        return result;

    }
    
}
