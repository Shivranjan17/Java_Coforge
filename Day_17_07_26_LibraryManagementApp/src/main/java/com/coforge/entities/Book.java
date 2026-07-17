package com.coforge.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private Integer bookId;
		private String title;
		
		@ManyToOne
		@JsonBackReference
		@JoinColumn(name="authorId")
		private Author author;
}
