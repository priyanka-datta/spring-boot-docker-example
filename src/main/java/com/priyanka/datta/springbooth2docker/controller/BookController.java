package com.priyanka.datta.springbooth2docker.controller;

import com.priyanka.datta.springbooth2docker.entity.Book;
import com.priyanka.datta.springbooth2docker.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    /*@PostMapping("/add/book")
    public String addBook(@RequestBody Book book){
        bookService.addBook(book);
        logger.info("Book has been added with id : {}", book.getId());
        return "created";
    }*/

    @GetMapping("/find/books")
    public List<Book> findBooks(){
        logger.info("Fetching all the books");
       return bookService.findAllBooks();
    }

    @GetMapping("/find/book/{id}")
    public Book findBookById(@PathVariable Integer id){
        logger.info("Fetching book with id : {}", id);
        return bookService.findBookById(id);
    }

    @GetMapping("/find/highRatedBooks")
    public List<Book> findHighestRatedBooks(){
        return bookService.findHighRatedBooks();
    }
}
