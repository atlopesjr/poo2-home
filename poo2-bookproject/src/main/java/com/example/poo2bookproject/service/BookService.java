package com.example.poo2bookproject.service;

import java.util.ArrayList;

import com.example.poo2bookproject.model.Book;
import com.example.poo2bookproject.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BookService
 */
@Service
public class BookService {
    @Autowired
    private BookRepository br;

    public ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<>(br.getBooks().values());

        return books;
    }

}