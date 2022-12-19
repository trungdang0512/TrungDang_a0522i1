package repository;

import model.Product;

import java.util.List;

public interface ProductRepository {
    void createNewProduct(Product product);
    void updateProduct(Product product);
    void deleteById(int id);
    Product findByName(String name);
    String viewProductDes(int id);
    List<Product>findAll();
}
