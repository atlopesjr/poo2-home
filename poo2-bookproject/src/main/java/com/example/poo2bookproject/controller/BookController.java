package com.example.poo2bookproject.controller;

import com.example.poo2bookproject.model.Book;
import com.example.poo2bookproject.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * BookController
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bs;

    @GetMapping("")
    public ModelAndView getBooks() {
        ModelAndView mv = new ModelAndView("books");
        mv.addObject("books", bs.getBooks());
        return mv;
    }

    @PostMapping("")
    public ModelAndView insertBook(@ModelAttribute Book book){
        bs.insertBook(book);
        return new ModelAndView("redirect:/book");
    }
}