package com.example.bt_product.dto;

public class ProductListDto {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private String producer;

    public ProductListDto() {
    }

    public ProductListDto(String name, Double price, String description, String producer) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public ProductListDto(Integer id, String name, Double price, String description, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
