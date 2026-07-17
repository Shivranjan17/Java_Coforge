package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Author;
import com.coforge.services.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	AuthorService service;
	
	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		return service.addAuthor(author);
	}
	

	@GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return service.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable Integer id) {
        return service.getAuthorById(id);
    }

    @PutMapping("/author/{id}")
    public Author updateAuthor(@PathVariable Integer id,
                               @RequestBody Author author) {

        return service.updateAuthor(id, author);
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthor(@PathVariable Integer id) {

        return service.deleteAuthor(id);
    }

}
