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

    public void insertBook(Book book){
        book.setCodigo(br.getBooks().size()+1);
        //Verifica Valor
        if(book.getPreco() < 1){
            book = null;
        } else {
            br.insertBook(book);
        }
    }

}