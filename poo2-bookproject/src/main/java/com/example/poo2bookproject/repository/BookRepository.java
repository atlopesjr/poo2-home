package com.example.poo2bookproject.repository;

import java.util.HashMap;

import com.example.poo2bookproject.model.Book;

import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public class BookRepository {

    public HashMap<Integer, Book> hm = new HashMap<>();

    public BookRepository() {
        hm.put(1, new Book(1, "Livro A", "Suspense", "Alexandre", 30));
        hm.put(2, new Book(2, "Livro B", "Terror", "Ana", 40));
        hm.put(3, new Book(3, "Livro C", "Aventura", "Joao", 50));
        hm.put(4, new Book(4, "Livro D", "Ficcao", "Marcos", 70));
        hm.put(5, new Book(5, "Livro E", "Drama", "Helen", 90));
    }

    public HashMap<Integer, Book> getBooks() {
        return hm;
    }
}