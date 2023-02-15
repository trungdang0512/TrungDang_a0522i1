package com.example.btbookstore.service;

import com.example.btbookstore.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    Book findById(Long id);
    Book borrowBook(Book book) throws Exception;
    Book payBook(Book book);
}
