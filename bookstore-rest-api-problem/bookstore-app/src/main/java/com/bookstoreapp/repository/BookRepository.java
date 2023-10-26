package com.bookstoreapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstoreapp.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
}
