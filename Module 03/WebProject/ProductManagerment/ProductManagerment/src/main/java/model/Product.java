package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String des;
    private String producer;

    public Product() {
    }

    public Product(String name){
        this.name = name;
    }

    public Product(int id, String name, double price, String des, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.des = des;
        this.producer = producer;
    }

    public Product(String name, double price, String des, String producer) {
        this.name = name;
        this.price = price;
        this.des = des;
        this.producer = producer;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", des='" + des + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
