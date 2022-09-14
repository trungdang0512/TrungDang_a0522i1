package ss11_JavaCollectionFramework.BT_product.models;

import java.util.Comparator;
import java.util.Objects;

public class Product {
    private int id;
    private String productName;
    private double price;

    public Product() {
    }

    public Product(int id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id || Objects.equals(productName, product.productName);
    }


//    @Override
//    public int compareTo(Product o) {
//        int a = (int) this.price;
//        int b = (int) o.price;
//        return a-b;
//    }
}
