package com.example.poo2bookproject.service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>(br.getBooks());

        return books;
    }

    public void getBook(Book book){
        br.getBook(book);
    }

}