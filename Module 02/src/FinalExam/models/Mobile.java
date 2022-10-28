package FinalExam.models;

public abstract class Mobile {
    private int id;
    private String name;
    private int price;
    private int amount;
    private String producer;

    public Mobile() {
    }

    public Mobile(int id, String name, int price, int amount, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,", id,name,price,amount,producer);
    }
}
