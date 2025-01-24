package com.example.mmm.repository;

import com.example.mmm.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    Book findByName(String name);
}
