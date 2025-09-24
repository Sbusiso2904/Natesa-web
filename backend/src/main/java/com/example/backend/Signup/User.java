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

     @Column
    private String name;

     @Column
    private String email;

     @Column
    private String password;

     @Column
    private String role;

     @Column
    private int branch_id;

     @Column
    private boolean IsbecMember;

     @Column
    private NecPos nec;     //position inside the NEC

     @Column
    private BecPos bec;     //position inside the BEC

     @Column
    private boolean status;     //waiting to be accepted on the application


    // Constructors
    public User() {}
    public User(String name, String email, String password, Long id) {
        this.name = name;
        this.email = email;
    }

//    // Getters & setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getName() { return name; }
//    public String password(){return this.password;}
//    public void setPassword(String password){this.password = password;}
//    public void setName(String name) { this.name = name; }
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public boolean isIsbecMember() {
        return IsbecMember;
    }

    public void setIsbecMember(boolean isbecMember) {
        IsbecMember = isbecMember;
    }

    public NecPos getNec() {
        return nec;
    }

    public void setNec(NecPos nec) {
        this.nec = nec;
    }

    public BecPos getBec() {
        return bec;
    }

    public void setBec(BecPos bec) {
        this.bec = bec;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}


