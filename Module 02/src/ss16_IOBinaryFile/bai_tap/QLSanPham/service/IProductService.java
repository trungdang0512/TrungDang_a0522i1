package ss16_IOBinaryFile.bai_tap.QLSanPham.service;

import ss16_IOBinaryFile.bai_tap.QLSanPham.models.Product;

import java.io.IOException;

public interface IProductService {
    void addProduct() throws IOException;

    void displayAll() throws IOException, ClassNotFoundException;

    void findProduct();

//    boolean checkProduct(int inputID);

    Product getProductInfo();
}
