package ss11_JavaCollectionFramework.BT_product.repository;

import ss11_JavaCollectionFramework.BT_product.helper.FileHelper;
import ss11_JavaCollectionFramework.BT_product.models.Product;
import ss11_JavaCollectionFramework.BT_product.util.Constant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository{

    private static List<Product> productList = new ArrayList<>();

    public ProductRepositoryImpl(){
        productList = mapToProduct();
    }
//
//    static {
//        productList.add(new Product(1,"CocaCola", 9.0));
//        productList.add( new Product(2, "Pepsi",8.5));
//        productList.add(new Product(3, "Redbull", 12.5));
//        productList.add(new Product(4, "ChocoPie", 5.5));
//        productList.add( new Product(5, "Revive", 10.8));
//        productList.add(new Product(6, "Marlboro", 20.0));
//        productList.add(new Product(7, "Caraven", 15.0));
//    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        try {
            FileHelper.writeFile(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void changeProductInfo(Product product, int indexCurrentProduct) {
        this.removeProduct(indexCurrentProduct);
        productList.add(indexCurrentProduct, product);
        try {
            FileHelper.writeFile(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeProduct(int inputID) {
        productList.remove(inputID);
        try {
            FileHelper.writeFile(productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    private List mapToProduct(){
        List result = new ArrayList();
        List<String> lines = FileHelper.readFile(Constant.FILE_PATH);

        for (String line: lines){
            String tmp[] = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String name = tmp[1];
            double price = Double.parseDouble(tmp[2]);

            result.add(new Product(id,name,price));
        }
        return result;
    }
}
