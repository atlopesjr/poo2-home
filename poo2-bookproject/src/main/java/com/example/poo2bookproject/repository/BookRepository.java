package com.example.poo2bookproject.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.poo2bookproject.model.Book;

import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public class BookRepository {

    public List<Book> bl = new ArrayList<>();

    public void insertBook(Book book){
        if(book != null){
            bl.add(book);
        }
    }

    public List<Book> getBooks() {
        return bl;
    }
}