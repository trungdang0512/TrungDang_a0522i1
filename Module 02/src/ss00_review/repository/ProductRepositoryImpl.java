package ss00_review.repository;

import ss00_review.modal.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository{

    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(12,"Nokia", 100.5));
        productList.add(new Product(5,"Samsung", 5.6));
        productList.add(new Product(8,"Iphone", 19.5));
        productList.add(new Product(2,"A", 19.5));
        productList.add(new Product(9,"B", 19.5));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        //Check id có tồn tại.
//        productList.contains(product);
//        productList.indexOf(product);
    }

    @Override
    public void removeProduct(int id) {
        int index = productList.indexOf(new Product(id));
        if(index != -1){
            productList.remove(index);
        } else {
            System.out.println("id not correct..");
        }

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }
}
