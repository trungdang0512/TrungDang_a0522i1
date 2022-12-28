package com.example.bt_product.service;

import com.example.bt_product.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService implements IProductService{
    private static final Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1,"iPhone 14", 1000.0,"Made in China","Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        Product findProduct = productMap.get(id);
        return findProduct;
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
        Product result  = null;
        for (Map.Entry<Integer,Product> entry : productMap.entrySet()){
            if (entry.getValue().getName().contains(name)){
                result = entry.getValue();
                break;
            }
        }
        return result;
    }
}
