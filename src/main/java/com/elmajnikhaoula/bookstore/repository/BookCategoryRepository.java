package com.elmajnikhaoula.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.elmajnikhaoula.bookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

}
