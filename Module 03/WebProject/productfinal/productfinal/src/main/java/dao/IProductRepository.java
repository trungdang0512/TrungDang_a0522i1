package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    void addNewProduct(Product product);
    boolean deleteProduct(String id) throws SQLException;
    boolean updateProduct(Product product);
    Product selectProduct(String id);
    List<Product> findProductByName(String name);
    List<Product> findAll();
}
