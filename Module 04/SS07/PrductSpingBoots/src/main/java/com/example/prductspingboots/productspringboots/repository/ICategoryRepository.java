package com.example.prductspingboots.productspringboots.repository;

import com.example.prductspingboots.productspringboots.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
