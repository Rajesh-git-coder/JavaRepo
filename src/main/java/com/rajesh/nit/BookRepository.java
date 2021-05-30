package com.rajesh.nit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajesh.nit.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
