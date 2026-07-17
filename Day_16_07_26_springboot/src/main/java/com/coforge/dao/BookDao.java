package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Book;
import com.coforge.repositories.BookRepository;

@Repository
public class BookDao {
	@Autowired
	BookRepository repository;
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	

public Book addBook(Book book) {
        return repository.save(book);
    }

public Optional<Book> getBookById(long id) {
	return repository.findById(id);
}


//public Book updateBook(Book book) {
//        return repository.save(book);
//    }

    public void deleteBook(long id) {
        repository.deleteById(id);
    }


	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return repository.getAllBooksByAuthorName(author);
	}
	
	public List<Book> findByTitle(String title){
		return repository.getAllBooksByTitle(title);
	}



}
