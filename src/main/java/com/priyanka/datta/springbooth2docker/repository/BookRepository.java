package com.priyanka.datta.springbooth2docker.repository;

import com.priyanka.datta.springbooth2docker.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    public List<Book> findByRating(Double rating);
}
