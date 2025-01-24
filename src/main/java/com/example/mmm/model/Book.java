package com.example.mmm.model;

import jakarta.persistence.*;
import  java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = false)
    private String name;

    @Column(nullable = false)
    public int cost;

    @Column(nullable = false)
    public String genre;

    @Column(nullable = false)
    public String author;

    @Column(name ="come_up_date")
    public LocalDate date;

    public Book(){}

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }


}
