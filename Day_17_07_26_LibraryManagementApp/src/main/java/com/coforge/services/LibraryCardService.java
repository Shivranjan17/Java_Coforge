package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.LibraryCard;
import com.coforge.repositories.LibraryCardRepository;

@Service
public class LibraryCardService {
	
	@Autowired
	LibraryCardRepository repository;
	
	public List<LibraryCard> getAllCards() {
		return repository.findAll();
		
	}
	
	public LibraryCard addCard(LibraryCard card) {
		return repository.save(card);
	}
	

    public LibraryCard getCardById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public LibraryCard updateCard(Integer id, LibraryCard card) {

        LibraryCard existing = repository.findById(id).orElse(null);

        if(existing != null) {

            existing.setCardNumber(card.getCardNumber());
            existing.setIssuDate(card.getIssuDate());
            existing.setStudent(card.getStudent());

            return repository.save(existing);
        }

        return null;
    }

    public String deleteCard(Integer id) {

        repository.deleteById(id);
        return "Card Deleted Successfully";
    }


}
