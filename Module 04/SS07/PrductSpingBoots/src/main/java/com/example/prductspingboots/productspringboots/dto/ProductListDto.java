package com.example.prductspingboots.productspringboots.dto;

import com.example.prductspingboots.productspringboots.model.Category;

public class ProductListDto {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String producer;
    private Category category;

    public ProductListDto() {
    }

    public ProductListDto(Long id, String name, Double price, String description, String producer, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
