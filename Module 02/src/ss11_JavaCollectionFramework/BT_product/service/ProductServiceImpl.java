package ss11_JavaCollectionFramework.BT_product.service;

import ss11_JavaCollectionFramework.BT_product.helper.SortByPriceHtoL;
import ss11_JavaCollectionFramework.BT_product.helper.SortByPriceLtoH;
import ss11_JavaCollectionFramework.BT_product.models.Product;
import ss11_JavaCollectionFramework.BT_product.repository.IProductRepository;
import ss11_JavaCollectionFramework.BT_product.repository.ProductRepositoryImpl;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService{
    private Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepositoryImpl();


    @Override
    public void addProduct() {
        productRepository.addProduct(this.inputProductInfo());
    }

    @Override
    public void changeProductInfo() {
        List<Product> productList = productRepository.findAll();

        System.out.println("Please input the product ID which you want to change: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        Product currentProduct = productRepository.findProductByID(inputID);
        int currentProductIndex = productRepository.findProductIndex(currentProduct);
        System.out.println("Please input new info for this product " + currentProduct.toString());

        Product newProduct = this.inputProductInfo();
        productRepository.changeProductInfo(newProduct, currentProductIndex);
        System.out.println("Product info has been changed!!");
    }

    @Override
    public void removeProduct() {
        List<Product> productList = productRepository.findAll();

        System.out.println("Input product's ID to remove: ");
        int inputID = scanner.nextInt();
        Product currentProduct = productRepository.findProductByID(inputID);
        if (currentProduct != null ){
            int currentProductIndex = this.findProductIndex(currentProduct);
            System.out.println("Are you sure to remove this product: " + productList.get(currentProductIndex).toString());
            System.out.println("1. Yes");
            System.out.println("2. No");
            switch (scanner.nextInt()) {
                case 1:
                    productRepository.removeProduct(currentProductIndex);
                    System.out.println("Done!");
                    break;
                case 2:
                    return;
            }
        }else {
            System.out.println("Cant find product!");
        }
    }

    @Override
    public void findProductByName() {
        List<Product> productList = productRepository.findAll();
        System.out.println("Input product name you want to find: ");
        Product foundProduct = productRepository.findProductByName(scanner.nextLine());
        if (foundProduct != null){
            System.out.println(foundProduct.toString());
        }else {
            System.out.println("Can't find product!!");
        }
    }

    @Override
    public void displayProductList() {
        List<Product> productList = productRepository.findAll();
        for (Product product: productList){
            System.out.println(product);
        }
    }

    @Override
    public int findProductIndex(Product product) {
        return productRepository.findProductIndex(product);
    }

    @Override
    public boolean checkProductIdExist(int inputID) {
        return productRepository.checkProductIdExist(inputID);
    }

    @Override
    public boolean checkProductNameExist(String inputName) {
        return productRepository.checkProductNameExist(inputName);
    }

    @Override
    public void arangeLtoH() {
        List<Product> productList = productRepository.findAll();
        Collections.sort(productList,new SortByPriceLtoH());
        System.out.println("Done!!");
        this.displayProductList();
    }

    @Override
    public void arangeHtoL() {
        List<Product> productList = productRepository.findAll();
        Collections.sort(productList,new SortByPriceHtoL());
        System.out.println("Done!!");
        this.displayProductList();
    }

    private Product inputProductInfo(){
        System.out.println("Input product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input product name: ");
        String name = scanner.nextLine();
        System.out.println("Input product price: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
}
