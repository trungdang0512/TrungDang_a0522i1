package ss16_IOBinaryFile.bai_tap.QLSanPham.repository;

import ss16_IOBinaryFile.bai_tap.QLSanPham.models.Product;
import ss16_IOBinaryFile.bai_tap.QLSanPham.until.PathHelper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository{


    private List<Product> productList = this.readDataFromFile();

    @Override
    public void addProduct(Product product) throws IOException {
        productList.add(product);
        this.writeDataToFile(productList);
    }

    @Override
    public List<Product> findAll() throws IOException, ClassNotFoundException {
        return productList;
    }

    @Override
    public Product findProduct(int inputID) {
        Product checkProduct = new Product(inputID);
        if (checkProduct(inputID)){
            int index;
            index = productList.indexOf(checkProduct);
            System.out.println(index);
            Product getProduct = productList.get(index);
            return getProduct;
        }else {
            return null;
        }
    }

    @Override
    public boolean checkProduct(int inputID) {
        Product checkProduct = new Product(inputID);
        boolean check = productList.contains(checkProduct);
        return check;
    }

    public void writeDataToFile(List<Product> products) throws IOException {
        FileOutputStream fos = new FileOutputStream(PathHelper.FILE_PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(products);
        oos.close();
    }

    public List<Product> readDataFromFile(){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(PathHelper.FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

}
