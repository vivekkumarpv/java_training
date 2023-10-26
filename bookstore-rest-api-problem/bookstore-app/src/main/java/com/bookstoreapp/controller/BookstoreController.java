package com.bookstoreapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookstoreapp.model.Book;
import com.bookstoreapp.service.BookstoreService;

@RestController
@RequestMapping("/books")
public class BookstoreController {

    @Autowired
    private BookstoreService bookstoreService;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookstoreService.getAllBooks();
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Book saveBook(@RequestBody Book book) {
        return bookstoreService.saveBook(book);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Book updateBook(@PathVariable int id,@RequestBody Book book) {
        return bookstoreService.updateBook(id, book);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteBook(@RequestParam("id") int id) {
    	bookstoreService.deleteBook(id);
        
    }
    
    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Book getBookById(@PathVariable int id) {
       return bookstoreService.getBookById(id);
    }




}
