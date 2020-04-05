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

    public List<Book> hm = new ArrayList<>();

    public void getBook(Book book){
        hm.add(book);
    }

    public List<Book> getBooks() {
        return hm;
    }
}