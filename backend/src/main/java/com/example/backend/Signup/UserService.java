package com.example.backend.Signup;

import java.util.Optional;

import org.springframework.stereotype.Service;
@Service
public class UserService {
   UserRespository userRespo;

    public UserService(UserRespository userRespo) {
        this.userRespo = userRespo;
    }

    public User registerUser(User user){
        Optional<User> existingUserByName = userRespo.findByUsername(user.getName());
        if(existingUserByName.isPresent()){
            
        }
        
        Optional<User> existingByEmail = userRespo.findByEmail(user.getEmail());
        if(existingByEmail.isPresent()){
            System.out.println("Email already exists!") ;
        }
        else{
            if (user.getIsBecMember() == null) {
                user.setIsBecMember(YesNo.NO); // default value
            }
            if (user.getStatus() == null) {
                user.setStatus(UserStatus.WAITING); // default value
            }
            if (user.getRole() == null) {
                user.setRole("USER"); // default role
            }
            // branch_id should be set by the client or handled here
            if (user.getBranch_id() == 0) {
                user.setBranch_id(1); // default branch
            }

        }
         return saveUser(user);
    }

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
