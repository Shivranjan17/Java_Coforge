package com.coforge.entities;

import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

////
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
////@Table(name="booktable")
//public class Book {
//	//minimal annotation required to create a table are 2 @Entity ,@Id
//	    @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//		private Long bookId;
//	    
//	   // @Column(name="firstTitle")
//		private String title;
//		
//		//@Column(name="authorName")
//		private String author;
//		private Double price;
//}





@Entity

@NamedQuery(name = "getAllBooksByAuthor" ,query="select b from Book b where b.author=:author")
@NamedQuery(name="getBookByTitle",query="select b from Book b where b.title = :title")
@Table(name="booktable")
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long bookId;
    @Size(min=3,message="title cant be less than 3 chars")
    @NotBlank
    private String title;
    
    @NotBlank
    private String author;
    
    @Pattern(regexp = "^[6789][0-9]{9}$",message= "Mobile No must start with either 6/7/8/9 with a length of 10 digits")
    private String authorMobile;
    @Email(message= "Please enter valid Email")
    private String email;
    
    @DecimalMin(value="100",inclusive = true,message="book min cost is 100rs")
    private double price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long bookId, @Size(min = 3, message = "title cant be less than 3 chars") @NotBlank String title,
			@NotBlank String author,
			@Pattern(regexp = "^[6789][0-9]{9}$", message = "Mobile No must start with either 6/7/8/9 with a length of 10 digits") String authorMobile,
			@Email(message = "Please enter valid Email") String email,
			@DecimalMin(value = "100", inclusive = true, message = "book min cost is 100rs") double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.authorMobile = authorMobile;
		this.email = email;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", authorMobile=" + authorMobile
				+ ", email=" + email + ", price=" + price + "]";
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorMobile() {
		return authorMobile;
	}

	public void setAuthorMobile(String authorMobile) {
		this.authorMobile = authorMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
//
//   
    

