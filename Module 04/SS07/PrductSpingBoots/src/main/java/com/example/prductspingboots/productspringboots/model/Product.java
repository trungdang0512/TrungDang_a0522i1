package com.example.prductspingboots.productspringboots.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    @NotEmpty
//    @Min(value = 3, message = "Minimum 3 characters!!!")
    @Size(max = 50,message = "Maximum 50 characters!!!")
    private String name;

    @Column(name = "price")
    @Min(value = 0, message = "Only Positive Number accepted")
//    @Pattern(regexp = "^\\d+$", message = "Only Positive Number accepted")
    private Double price;

    @Column(name = "description", length = 1000)
    @NotEmpty
    @Size(max = 1000, message = "The text length is not valid!!! Only accept 0-1000 characters")
    private String description;

    @Column(name = "producer")
    @NotEmpty
    @Size(max = 50,message = "The text length is not valid!!! Only accept 0-50 characters")
    private String producer;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public Product() {
    }

    public Product(Long id, String name, Double price, String description, String producer, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
        this.category = category;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
