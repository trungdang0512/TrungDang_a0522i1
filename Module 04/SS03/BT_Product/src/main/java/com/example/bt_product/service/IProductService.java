package com.example.bt_product.service;

import com.example.bt_product.dto.ProductListDto;
import com.example.bt_product.model.Product;

import java.util.List;

public interface IProductService {
    List<ProductListDto> findAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(int id);
    List<Product> findByName(String name);
}
