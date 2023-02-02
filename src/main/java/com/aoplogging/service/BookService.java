package com.aoplogging.service;

import com.aoplogging.model.Book;

import java.util.Optional;

public interface BookService {

    Optional<Book> findById(Long bookId);

    Book saveBook(Book book);

    void updateBook(Long bookId, Book book);

    void deleteById(Long bookId);
}
