package com.example.prductspingboots.productspringboots.service;

import com.example.prductspingboots.productspringboots.dto.ProductListDto;
import com.example.prductspingboots.productspringboots.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IProductService {
    List<ProductListDto> findAll();
    Page<Product> getAllWithPage(PageRequest pageRequest);
    void save(Product product);
    Product findById(Long id);
    void update (Product product);
    void deleteById(Long id);
}
