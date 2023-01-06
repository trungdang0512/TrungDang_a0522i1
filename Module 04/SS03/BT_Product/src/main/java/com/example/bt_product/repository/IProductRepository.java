package com.example.bt_product.repository;

import com.example.bt_product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(Product product);
    void remove(int id);
    List<Product> findByName(String name);
}
