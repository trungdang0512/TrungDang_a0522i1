package com.example.bt_blog.service;

import com.example.bt_blog.model.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> findAll();
    void save(Author author);
    void findById(Integer id);
    void delete(Integer id);
}
