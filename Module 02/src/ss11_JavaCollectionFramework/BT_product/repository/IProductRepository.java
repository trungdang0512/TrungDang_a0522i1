package ss11_JavaCollectionFramework.BT_product.repository;

import ss11_JavaCollectionFramework.BT_product.models.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);

    void changeProductInfo(Product product, int indexCurrentProduct);

    void removeProduct(int inputID);

    Product findProductByName(String inputName);

    List<Product> arrangeLtoH();

    List<Product> arrangeHtoL();

    List<Product> findAll();

    int findProductIndex(Product product);

    boolean checkProductIdExist(int inputID);

    boolean checkProductNameExist(String inputName);

    Product findProductByID(int inputID);
}
