package ss11_JavaCollectionFramework.BT_product.service;

import ss11_JavaCollectionFramework.BT_product.models.Product;

import java.util.List;

public interface IProductService {
    void addProduct();

    void changeProductInfo();

    void removeProduct();

    void findProductByName();

    void displayProductList();

    int findProductIndex(Product product);

    boolean checkProductIdExist(int inputID);

    boolean checkProductNameExist(String inputName);

    void arangeLtoH();

    void arangeHtoL();
}
