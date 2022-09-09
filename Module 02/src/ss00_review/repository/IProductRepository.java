package ss00_review.repository;

import ss00_review.modal.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);

    void removeProduct(int id);

    List<Product> findAll();
}
