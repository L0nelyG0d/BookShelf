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

    @Column(name = "sign_up_date", nullable = false)
    private LocalDate date;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
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

    public void setPassword(){
        this.password = password;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }
}
