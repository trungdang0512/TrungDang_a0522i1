package com.example.bt_blog.service.impl;

import com.example.bt_blog.dto.BlogListDto;
import com.example.bt_blog.model.Blog;
import com.example.bt_blog.repository.IBlogRepository;
import com.example.bt_blog.service.IBlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public List<BlogListDto> findAll() {
        List<Blog> blogList = iBlogRepository.findAll();
        List<BlogListDto> blogListDtoList = new ArrayList<>();
        BlogListDto blogListDto;
        for (Blog blog: blogList){
            blogListDto = new BlogListDto();
            BeanUtils.copyProperties(blog, blogListDto);
            blogListDtoList.add(blogListDto);
        }
        return blogListDtoList;
    }

    @Override
    public Page<Blog> getAllWithPage(PageRequest pageRequest) {
        return iBlogRepository.findAllWithPage(pageRequest);
    }

    @Override
    public void save(Blog blog) {
        this.iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public List<Blog> findByName(String name) {
        return iBlogRepository.findByName(name);
    }
}
