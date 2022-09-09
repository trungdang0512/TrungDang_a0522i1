package ss00_review.service;

import ss00_review.modal.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    void removeProduct(int id);

    List<Product> findAll();
}
