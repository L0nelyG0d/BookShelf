package com.example.mmm.service;

import com.example.mmm.model.Book;
import com.example.mmm.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();

    }

    public Optional<Book> getBookByName(String name) {
        return bookRepository.findByName(name);
    }

    public boolean deleteBookByName(String name){
        if(bookRepository.findByName(name).isPresent()){
            bookRepository.deleteByName(name);
            return true;
        }
        return false;
    }
}


