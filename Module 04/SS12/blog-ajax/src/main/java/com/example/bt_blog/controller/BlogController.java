package com.example.bt_blog.controller;

import com.example.bt_blog.model.Author;
import com.example.bt_blog.model.Blog;
import com.example.bt_blog.model.Category;
import com.example.bt_blog.repository.ICategoryRepository;
import com.example.bt_blog.service.IAuthorService;
import com.example.bt_blog.service.IBlogService;
import com.example.bt_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private IAuthorService authorService;
    @Autowired
    private ICategoryService categoryService;
        @GetMapping("/blog")
        public String getList(@RequestParam(value = "page", defaultValue = "0")int page, Model model){
            Sort sort = Sort.by("id").ascending();
            model.addAttribute("bloglist", blogService.getAllWithPage(PageRequest.of(page,10,sort)));
            return "blog";
        }

    @GetMapping("/add")
    public String showAdd(Model model){
        model.addAttribute("newblog", new Blog());
        model.addAttribute("authorlist", authorService.findAll());
        model.addAttribute("categorylist", categoryService.findAll());
        return "create";
    }

    @GetMapping("/newcategory")
    public String addCategory(Model model){
        model.addAttribute("newcategory", new Category());
        return "category";
    }
    @GetMapping("/newauthor")
    public String addAuthor(Model model){
        model.addAttribute("newauthor", new Author());
        return "author";
    }
    @PostMapping("/saveauthor")
    public String saveAuthor(@ModelAttribute("newauthor") Author author, RedirectAttributes redirectAttributes){
        this.authorService.save(author);
        return "redirect:/blog";
    }
    @PostMapping("/savecategory")
    private String addCategory(@ModelAttribute("newcategory") Category category){
        this.categoryService.save(category);
        return "redirect:/blog";
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
        model.addAttribute("authorlist  ", authorService.findAll());
        model.addAttribute("categorylist", categoryService.findAll());
        return "edit";
    }

    @PostMapping("/update")
    public String update(Blog blog){
        blogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") Integer id, Model model){
        blogService.deleteById(id);
        model.addAttribute("bloglist", blogService.findAll());
        return "redirect:/blog";
    }

    @GetMapping("/find/{name}")
    public String findBlogByTitle(@ModelAttribute("name") String title,Model model){
        model.addAttribute("bloglist", blogService.findByName(title));
        return "blog";
    }
}
