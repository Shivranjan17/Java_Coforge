package com.coforge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.coforge.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
	//List<Book> findByAuthor(String author);
	//native query
	//@Query(value ="select * from book where author =?",nativeQuery = true)
	//@Query(value="select * from book where title=?",nativeQuery=true)
	//@Query(value="select b from Book b where b.title=:title")
	@Query(name="getBookByTitle")
	Book findByTitle(String title);
	List<Book> getAllBooksByTitle(@Param("title")String title);
	Book findByAuthorMobile(String authorMobile);
	
	
//	@Query(value="select * from book where author= ?",nativeQuery=true)//native query
	//@Query(value="select b from Book b where author= :author")
	@Query(name="getAllBooksByAuthor")
	List<Book> getAllBooksByAuthorName(@Param("author")String author);
}
