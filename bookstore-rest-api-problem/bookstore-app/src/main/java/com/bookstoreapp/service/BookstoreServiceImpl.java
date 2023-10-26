package com.bookstoreapp.service;

import com.bookstoreapp.exception.BookAlreadyExistsException;
import com.bookstoreapp.exception.BookNotFoundException;
import com.bookstoreapp.model.Book;
import com.bookstoreapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookstoreServiceImpl implements BookstoreService{
	
	@Autowired
	BookRepository repo;

	@Override
	public List<Book> getAllBooks() {
		return repo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		if(!repo.existsById(id)) {
			throw new BookNotFoundException("Book not found");
		}
		return repo.findById(id).get();
	}

	@Override
	public Book saveBook(Book book) {
		if(repo.existsById(book.getId())) {
			throw new BookAlreadyExistsException("Book already exists");
		}
		return repo.save(book);
	}

	@Override
	public Book updateBook(int id, Book book) {
		if(!repo.existsById(book.getId())) {
			throw new BookNotFoundException("Book not found");
		}
		return repo.save(book);
	}

	@Override
	public void deleteBook(int id) {
		if(!repo.existsById(id)) {
			throw new BookNotFoundException("Book not found");
		}
		repo.deleteById(id);
	}

   


}
