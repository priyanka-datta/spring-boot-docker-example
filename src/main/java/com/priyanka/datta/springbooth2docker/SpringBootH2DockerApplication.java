package com.priyanka.datta.springbooth2docker;

import com.priyanka.datta.springbooth2docker.entity.Book;
import com.priyanka.datta.springbooth2docker.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootH2DockerApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setBookName("Pather Panchali");
		book.setAuthorName("Bibhutibhushan Bandyopadhyay");
		book.setRating(5.0);
		Book book1 = new Book();
		book1.setBookName("Hamlet");
		book1.setAuthorName("William Shakespeare");
		book1.setRating(5.0);
		bookRepository.save(book);
		bookRepository.save(book1);
	}
}
