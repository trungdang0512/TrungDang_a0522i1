package com.example.bt_blog.controller;

import com.example.bt_blog.model.Blog;
import com.example.bt_blog.repository.IBlogRepository;
import com.example.bt_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private IBlogRepository iBlogRepository;

    @GetMapping("/blog")
    public String getList(Model model){
        model.addAttribute("bloglist", blogService.findAll());
        return "blog";
    }

    @GetMapping("/add")
    public String showAdd(Model model){
        model.addAttribute("newblog", new Blog());
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("newblog")Blog blog, RedirectAttributes redirectAttributes){
        this.blogService.save(blog);
        redirectAttributes.addFlashAttribute("msg", "Saving Successfully!!!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "view";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Blog blog){
        blogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") Integer id, Model model){
        blogService.deleteById(id);
        model.addAttribute("bloglist", blogService.findAll());
        return "redirect:/blog";
    }
}
