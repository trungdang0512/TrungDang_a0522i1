package com.example.bt_blog.dto;

public class BlogListDto {
    private Integer id;
    private String title;
    private String author;
    private String content;
    private String tag;

    public BlogListDto() {
    }

    public BlogListDto(Integer id, String title, String author, String content, String tag) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.tag = tag;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
