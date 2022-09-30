package ss16_IOBinaryFile.bai_tap.QLSanPham.service;

import ss16_IOBinaryFile.bai_tap.QLSanPham.models.Product;
import ss16_IOBinaryFile.bai_tap.QLSanPham.repository.IProductRepository;
import ss16_IOBinaryFile.bai_tap.QLSanPham.repository.ProductRepositoryImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService{
    private static Scanner scanner = new Scanner(System.in);
    private static IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void addProduct() throws IOException {
        Product newProduct = this.getProductInfo();
        productRepository.addProduct(newProduct);
    }

    @Override
    public void displayAll() throws IOException, ClassNotFoundException {
        List<Product> productList = productRepository.findAll();
        for (Product product: productList){
            System.out.println(product.toString());
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Input product's ID to find: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        Product foundProduct = productRepository.findProduct(inputID);
        System.out.println(foundProduct.toString());
    }

    @Override
    public Product getProductInfo() {
        System.out.println("Input new product info: ");
        System.out.println("Input product's ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input product's name: ");
        String name = scanner.nextLine();
        System.out.println("Input product's brand: ");
        String brand = scanner.nextLine();
        System.out.println("Input product's price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input another product's info: ");
        String note = scanner.nextLine();

        Product product = new Product(id, name, brand,price,note);
        return product;
    }
}
