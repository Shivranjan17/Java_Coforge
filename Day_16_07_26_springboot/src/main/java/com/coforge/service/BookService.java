package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.BookDao;
import com.coforge.entities.Book;
import com.coforge.exceptions.BookNotFoundException;

@Service
public class BookService {
	@Autowired
	BookDao dao;

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}
	

public Book addBook(Book book) {
        return dao.addBook(book);
    }

public Book getBookById(long id) {
	return dao.getBookById(id)
			.orElseThrow(()->new  BookNotFoundException("Book with this id not exists"));
}


public Book updateBook(Long id,Book book) {
	Book exBook = dao.getBookById(id)
			.orElseThrow(()->new  BookNotFoundException("Book with this id not exists"));
   
    	exBook.setTitle(book.getTitle());
    	exBook.setAuthor(book.getAuthor());
    	exBook.setPrice(book.getPrice());
    	return dao.addBook(exBook);
    
	
}
	

    public String deleteBook(long id) {
    	Book exBook= dao.getBookById(id)
    			.orElseThrow(()->new  BookNotFoundException("Book with this id not exists"));
    	
        dao.deleteBook(id);
    		return "book deleted";
    }

    public List<Book> findByAuthor(String author){
    	return dao.findByAuthor(author);
    }
    
    public  List<Book> findByTitle(String title){
    	return dao.findByTitle(title);
    }
	
}
