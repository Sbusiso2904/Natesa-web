package com.example.backend.Signup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

     @Column(nullable = false)
    private String name;

     @Column(unique = true, nullable = false)
    private String email;

     @Column(unique = true, nullable = false)
    private String password;

     @Column(unique = true, nullable = false)
    private String role;

     @Column(unique = true, nullable = false)
    private int branch_id;

   @Enumerated(EnumType.STRING)
    @Column(name = "is_bec_member", nullable = false)
    private YesNo IsbecMember; // create enum YesNo { YES, NO }
        
    @Column(name = "nec_position")
private String nec;

    @Column(name = "bec_position")
    private String bec;    //position inside the BEC
  
     @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus status;    //waiting to be accepted on the application


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
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public int getBranch_id() { return branch_id; }
    public void setBranch_id(int branch_id) { this.branch_id = branch_id; }
    public YesNo getIsBecMember() { return IsbecMember; }
    public void setIsBecMember(YesNo IsbecMember) { this.IsbecMember = IsbecMember; }
    public String getNec() { return nec; }
    public void setNec(String nec) { this.nec = nec; }
    public String getBec() { return bec; }
    public void setBec(String bec) { this.bec = bec; }
    public UserStatus  getStatus() { return status; }
    public void setStatus(UserStatus  status) { this.status = status; }     //position inside the NEC

}
