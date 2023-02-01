package com.example.bt_blog.model;

import javax.persistence.*;

@Entity(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "author")
    private String author;

    public Author() {
    }

    public Author(Integer id, String author) {
        this.id = id;
        this.author = author;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }
}
