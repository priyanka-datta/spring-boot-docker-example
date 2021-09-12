package com.priyanka.datta.springbooth2docker.service;

import com.priyanka.datta.springbooth2docker.entity.Book;
import com.priyanka.datta.springbooth2docker.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.priyanka.datta.springbooth2docker.constant.BookConstant.*;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book findBookById(Integer id){
        return bookRepository.findById(id).get();
    }

    public List<Book> findHighRatedBooks(){
        return bookRepository.findAll().parallelStream().
                filter(book -> book.getRating()>BOOK_HIGHER_RATING).
                collect(Collectors.toList());
    }
}
