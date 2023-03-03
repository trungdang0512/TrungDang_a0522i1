package com.example.bt_blog.service.impl;

import com.example.bt_blog.model.Category;
import com.example.bt_blog.repository.ICategoryRepository;
import com.example.bt_blog.service.ICategoryService;
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
    public void findById(Integer id) {

    }

    @Override
    public void delete(Integer id) {

    }
}
