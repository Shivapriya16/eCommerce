package com.java.e_commerce.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public int id;
    public String username;
    public String email;
    public String password;
    public String role;
    public String address;
}
