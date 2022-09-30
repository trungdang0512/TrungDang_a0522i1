package ss16_IOBinaryFile.bai_tap.QLSanPham.controller;

import ss16_IOBinaryFile.bai_tap.QLSanPham.service.IProductService;
import ss16_IOBinaryFile.bai_tap.QLSanPham.service.ProductServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class ProductController {
    private static IProductService productService = new ProductServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("Please choose the function: ");
            System.out.println("1. Add new Product");
            System.out.println("2. Find Product by ID");
            System.out.println("3. Display product list");
            System.out.println("4. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.findProduct();
                    break;
                case 3:
                    productService.displayAll();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}

