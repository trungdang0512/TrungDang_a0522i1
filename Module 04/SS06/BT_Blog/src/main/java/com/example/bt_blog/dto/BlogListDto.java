package com.example.bt_blog.dto;

import com.example.bt_blog.model.Author;
import com.example.bt_blog.model.Category;

public class BlogListDto {
    private Integer id;
    private String title;
    private String content;
    private Category category;
    private Author author;

    public BlogListDto() {
    }

    public BlogListDto(Integer id, String title, String content, Category category, Author author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.category = category;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
