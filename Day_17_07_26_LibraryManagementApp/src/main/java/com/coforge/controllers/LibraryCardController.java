package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.LibraryCard;
import com.coforge.services.LibraryCardService;

@RestController
public class LibraryCardController {
	
	@Autowired
	LibraryCardService service;
	@PostMapping("/card")
	public LibraryCard addCard(@RequestBody LibraryCard card ) {
		return service.addCard(card);
	}
	

@GetMapping("/cards")
    public List<LibraryCard> getAllCards() {
        return service.getAllCards();
    }

    @GetMapping("/card/{id}")
    public LibraryCard getCardById(@PathVariable Integer id) {
        return service.getCardById(id);
    }

    @PutMapping("/card/{id}")
    public LibraryCard updateCard(@PathVariable Integer id,
                                  @RequestBody LibraryCard card) {

        return service.updateCard(id, card);
    }

    @DeleteMapping("/card/{id}")
    public String deleteCard(@PathVariable Integer id) {

        return service.deleteCard(id);
    }


}
