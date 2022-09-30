package ss16_IOBinaryFile.bai_tap.QLSanPham.models;

import java.io.Serializable;

public class Product implements Serializable {
    public static final long serialVersionUID = 5525273113887827951L;

    private int id;
    private String name;
    private String brand;
    private double price;
    private String note;

    public Product(){}

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name, String brand, double price, String note) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
