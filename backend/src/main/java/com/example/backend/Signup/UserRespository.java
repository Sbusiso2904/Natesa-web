package com.example.backend.Signup;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long>{
    //for signup
//    Optional<User> findByUsername(String username);
//    Optional<User> findByName(String username);
    Optional<User> findByEmail(String email);

    //for login
    Optional<User> findByPassword(String password);


}


