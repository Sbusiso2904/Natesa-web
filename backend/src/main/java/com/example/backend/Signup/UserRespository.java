package com.example.backend.Signup;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    
}
