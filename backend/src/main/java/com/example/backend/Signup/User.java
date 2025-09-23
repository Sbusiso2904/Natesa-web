package com.example.backend.Signup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;

     @Column(unique = true, nullable = false)
    private String name;

     @Column(unique = true, nullable = false)
    private String email;

     @Column(unique = true, nullable = false)
    private String password;

     @Column(unique = true, nullable = false)
    private String role;

     @Column(unique = true, nullable = false)
    private int branch_id;

     @Column(unique = true, nullable = false)
    private boolean IsbecMember;
    
     @Column(unique = true, nullable = false)
    private NecPos nec;     //position inside the NEC
   
     @Column(unique = true, nullable = false)
    private BecPos bec;     //position inside the BEC
  
     @Column(unique = true, nullable = false)
    private boolean status;     //waiting to be accepted on the application


    // Constructors
    public User() {}
    public User(String name, String email, String password, Long id) {
        this.name = name;
        this.email = email;
    }

    // Getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public String password(){return this.password;}
    public void setPassword(String password){this.password = password;}
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
