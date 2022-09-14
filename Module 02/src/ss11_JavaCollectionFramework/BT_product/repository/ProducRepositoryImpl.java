package ss11_JavaCollectionFramework.BT_product.repository;

import ss11_JavaCollectionFramework.BT_product.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProducRepositoryImpl implements IProductRepository{

    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1,"CocaCola", 9.0));
        productList.add( new Product(2, "Pepsi",8.5));
        productList.add(new Product(3, "Redbull", 12.5));
        productList.add(new Product(4, "ChocoPie", 5.5));
        productList.add( new Product(5, "Revive", 10.8));
        productList.add(new Product(6, "Marlboro", 20.0));
        productList.add(new Product(7, "Caraven", 15.0));
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void changeProductInfo(Product product, int indexCurrentProduct) {
        this.removeProduct(indexCurrentProduct);
        productList.add(indexCurrentProduct, product);
    }

    @Override
    public void removeProduct(int inputID) {
        productList.remove(inputID);
    }

    @Override
    public Product findProductByName(String inputName) {
        Product productCheck = new Product(inputName);
        int indexProduct = productList.indexOf(productCheck);
        if (indexProduct!= -1){
            return productList.get(indexProduct);
        }else {
            return null;
        }
    }

    @Override
    public List<Product> arrangeLtoH() {
        return null;
    }

    @Override
    public List<Product> arrangeHtoL() {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public int findProductIndex(Product product) {
        return productList.indexOf(product);
    }

    @Override
    public boolean checkProductIdExist(int inputID) {
        Product productCheck = new Product(inputID);
        return productList.contains(productCheck);
    }

    @Override
    public boolean checkProductNameExist(String inputName) {
        Product productCheck = new Product(inputName);
        return productList.contains(productCheck);
    }

    @Override
    public Product findProductByID(int inputID) {
        Product productCheck = new Product(inputID);
        int index = productList.indexOf(productCheck);
        return productList.get(index);
    }
}
