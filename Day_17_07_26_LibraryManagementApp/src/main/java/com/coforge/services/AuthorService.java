package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Author;
import com.coforge.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository repository;
	
	public Author addAuthor(Author author) {
		return repository.save(author);
	}
	

	 public List<Author> getAllAuthors() {
	        return repository.findAll();
	    }

	    public Author getAuthorById(Integer id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Author updateAuthor(Integer id, Author author) {

	        Author existing = repository.findById(id).orElse(null);

	        if(existing != null) {

	            existing.setAuthorName(author.getAuthorName());
	            existing.setContactNum(author.getContactNum());
	            existing.setBookList(author.getBookList());

	            return repository.save(existing);
	        }

	        return null;
	    }

	    public String deleteAuthor(Integer id) {

	        repository.deleteById(id);
	        return "Author Deleted Successfully";
	    }


}
