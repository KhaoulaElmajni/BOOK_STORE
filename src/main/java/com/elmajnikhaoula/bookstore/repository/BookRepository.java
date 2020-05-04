package com.elmajnikhaoula.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elmajnikhaoula.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

	
}
