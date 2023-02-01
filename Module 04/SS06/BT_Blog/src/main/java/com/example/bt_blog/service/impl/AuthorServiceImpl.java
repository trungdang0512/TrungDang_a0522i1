package com.example.bt_blog.service.impl;

import com.example.bt_blog.model.Author;
import com.example.bt_blog.repository.IAuthorRepository;
import com.example.bt_blog.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorServiceImpl implements IAuthorService {
    @Autowired
    private IAuthorRepository authorRepository;
    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void save(Author author) {
            authorRepository.save(author);
    }

    @Override
    public void findById(Integer id) {
        authorRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        authorRepository.deleteById(id);
    }
}
