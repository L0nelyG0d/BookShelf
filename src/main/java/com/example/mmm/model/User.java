package com.example.mmm.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }


    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
