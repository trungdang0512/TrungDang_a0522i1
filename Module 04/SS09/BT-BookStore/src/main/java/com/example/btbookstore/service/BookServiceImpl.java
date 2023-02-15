package com.example.btbookstore.service;

import com.example.btbookstore.model.Book;
import com.example.btbookstore.repository.IBookRepository;
import com.example.btbookstore.until.GenerateCodeRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService{
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(new Book());
    }
    @Override
    public Book borrowBook(Book book) throws Exception{
        book.setAmount(book.getAmount()-1);
        return bookRepository.save(book);
    }
    @Override
    public Book payBook(Book book) {
        book.setAmount(book.getAmount()+1);
        return bookRepository.save(book);
    }
}
