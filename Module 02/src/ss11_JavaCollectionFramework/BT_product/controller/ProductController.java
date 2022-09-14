package ss11_JavaCollectionFramework.BT_product.controller;



import ss11_JavaCollectionFramework.BT_product.service.IProductService;
import ss11_JavaCollectionFramework.BT_product.service.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    private static IProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please choose the function: ");
            System.out.println("1. Add new Product");
            System.out.println("2. Change product info");
            System.out.println("3. Remove product");
            System.out.println("4. Display product list");
            System.out.println("5. Find product by name");
            System.out.println("6. Arrange product list: High to Low price");
            System.out.println("7. Arrange product list: Low to High price");
            System.out.println("8. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.changeProductInfo();
                    break;
                case 3:
                case 4:
                    productService.displayProductList();
                    break;
                case 5:
                    productService.findProductByName();
                    break;
                case 6:
                    productService.arangeHtoL();
                    break;
                case 7:
                    productService.arangeLtoH();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}
