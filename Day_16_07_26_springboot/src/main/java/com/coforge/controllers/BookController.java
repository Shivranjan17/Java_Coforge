package com.coforge.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Book;
import com.coforge.service.BookService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

//@Controller
//@ResponseBody

@RestController
public class BookController {
//	
//		@GetMapping("/hello")
//		public String sayHello() {
//			return "Hello Shiva";
//		}
	private static final Logger logger =LoggerFactory.getLogger(BookController.class);
	
	
	@Autowired
	BookService service;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(HttpServletRequest request) {
		logger.info("getAllBooks api started :"+LocalDateTime.now());
		logger.info("ApiName : {}",request.getRequestURI());
		logger.info("Method : {}",request.getMethod());
	    List<Book> bookList = service.getAllBooks();
	    logger.info("All books retrived");
	    logger.info("getAllBooks api closing now : "+LocalDateTime.now());
	    return ResponseEntity.ok(bookList);
	}
	
	
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@Valid @RequestBody Book book) {

	    Book savedBook = service.addBook(book);

	    return ResponseEntity.status(HttpStatus.CREATED)
	            .body(savedBook);
	}
	
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable long id) {

	    Book book = service.getBookById(id);

	    return ResponseEntity.ok(book);
	}


	@PutMapping("/books/{id}")
	public ResponseEntity<Book> updateBook(
	        @PathVariable Long id,
	        @RequestBody Book book) {

	    Book updatedBook = service.updateBook(id, book);

	    return ResponseEntity.ok(updatedBook);
	}

	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable long id) {

	    String msg = service.deleteBook(id);

	    return ResponseEntity.ok(msg);
	}
	
	@GetMapping("/books/author/{author}")
	public List<Book> findByAuthor(@PathVariable("author") String author){
		return service.findByAuthor(author);
	}
	
	@GetMapping("/books/title/{title}")
	public List<Book> findByTitle(@PathVariable("title") String title) {
		return service.findByTitle(title);
	}
	}

	

