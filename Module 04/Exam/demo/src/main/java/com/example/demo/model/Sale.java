package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotEmpty(message = "Không được để trống")
    private String title;
    @NotEmpty(message = "Không được để trống")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String startDate;
    @NotEmpty(message = "Không được để trống")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String endDate;

    @Min(value = 10000, message = "Minimum Price is 10.000vnđ")
    private Integer price;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 1000, message = "The text length is not valid!!! Only accept 0-1000 characters")
    private String detail;

    public Sale() {
    }

    public Sale(Long id, String title, String startDate, String endDate, Integer price, String detail) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
