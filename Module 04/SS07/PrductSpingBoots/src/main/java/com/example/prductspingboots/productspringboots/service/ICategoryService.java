package com.example.prductspingboots.productspringboots.service;

import com.example.prductspingboots.productspringboots.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    void save(Category category);
    void findById(Long id);
    void deleteById(Long id);
}
