package com.example.bt_blog.service;

import com.example.bt_blog.model.Author;
import com.example.bt_blog.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    void save(Category category);
    void findById(Integer id);
    void delete(Integer id);
}
