package com.example.bt_product.service;

import com.example.bt_product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void remove(int id);

    Product findByName(String name);
}
