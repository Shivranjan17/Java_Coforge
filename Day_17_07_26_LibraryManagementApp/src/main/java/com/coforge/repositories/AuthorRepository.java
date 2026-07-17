package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
