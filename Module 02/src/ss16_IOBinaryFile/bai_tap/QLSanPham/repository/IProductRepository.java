package ss16_IOBinaryFile.bai_tap.QLSanPham.repository;

import ss16_IOBinaryFile.bai_tap.QLSanPham.models.Product;

import java.io.IOException;
import java.util.List;

public interface IProductRepository {
    void addProduct(Product product) throws IOException;

    List<Product> findAll() throws IOException, ClassNotFoundException;

    Product findProduct(int inputID);

    boolean checkProduct(int inputID);
}
