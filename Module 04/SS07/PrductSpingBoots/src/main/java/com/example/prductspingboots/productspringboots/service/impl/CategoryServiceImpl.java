package com.example.prductspingboots.productspringboots.service.impl;

import com.example.prductspingboots.productspringboots.model.Category;
import com.example.prductspingboots.productspringboots.repository.ICategoryRepository;
import com.example.prductspingboots.productspringboots.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void findById(Long id) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
