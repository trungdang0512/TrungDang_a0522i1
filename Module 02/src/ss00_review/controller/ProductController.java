package ss00_review.controller;

import ss00_review.modal.Product;
import ss00_review.service.IProductService;
import ss00_review.service.ProductServiceImpl;
import ss08_mvc.model.Student;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static IProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("---- Product Manager ----");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("3. Remove by id");
            System.out.println("4. Sort");
            System.out.println("9. Exit");

            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1: //List
                    List<Product> productList = productService.findAll();
                    for (Product product : productList) {
                        System.out.println(product);
                    }
                    break;
                case 2: //add
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Input Price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Product product = new Product(id, name, price);
                    productService.addProduct(product);

                    break;
                case 3:
                    System.out.print("Input Id: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    productService.removeProduct(idDelete);
                    break;
                case 4:
                    List<Product> productList1 = productService.findAll();
                    Collections.sort(productList1);
                    for (Product product1 : productList1) {
                        System.out.println(product1);
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
