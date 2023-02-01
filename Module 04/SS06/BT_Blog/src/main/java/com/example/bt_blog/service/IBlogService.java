package com.example.bt_blog.service;

import com.example.bt_blog.dto.BlogListDto;
import com.example.bt_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IBlogService {
    List<BlogListDto> findAll();
    Page<Blog> getAllWithPage(PageRequest pageRequest);
    void save(Blog blog);
    Blog findById(Integer id);
    void update(Blog blog);
    void deleteById(Integer id);
}
