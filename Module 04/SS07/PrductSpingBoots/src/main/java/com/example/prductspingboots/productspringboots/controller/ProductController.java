package com.example.prductspingboots.productspringboots.controller;

import com.example.prductspingboots.productspringboots.model.Category;
import com.example.prductspingboots.productspringboots.model.Product;
import com.example.prductspingboots.productspringboots.service.ICategoryService;
import com.example.prductspingboots.productspringboots.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/product")
    public String getList(@RequestParam(value = "page", defaultValue = "0")int page, Model model){
        Sort sort = Sort.by("id").ascending();
        model.addAttribute("productList",productService.getAllWithPage(PageRequest.of(page,10,sort)));
        return "product";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("categoryList", categoryService.findAll());
        return "create";
    }

    @PostMapping("/save")
    public String createProduct(@ModelAttribute("product")Product product, RedirectAttributes redirectAttributes){
        this.productService.save(product);
        redirectAttributes.addFlashAttribute("msg", "Saving Successfully!!!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable("id") Long id, Model model){
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("categoryList", categoryService.findAll());
        return "edit";
    }

    @PostMapping("/update")
    public String updateProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes){
        this.productService.save(product);
        redirectAttributes.addFlashAttribute("msg", "Editing Successfully!!!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable("id") Long id,
                                Model model,
                                @RequestParam(value = "page", defaultValue = "0")int page,
                                RedirectAttributes redirectAttributes){
        this.productService.deleteById(id);
        Sort sort = Sort.by("id").ascending();
        model.addAttribute("productList",productService.getAllWithPage(PageRequest.of(page,10,sort)));
        redirectAttributes.addFlashAttribute("msg", "Deleting Successfully!!!");
        return "redirect:/product";
    }

    @GetMapping("/newcategory")
    public String showAddCategory(Model model){
        model.addAttribute("newcategory", new Category());
        return "category";
    }

    @PostMapping("/savecategory")
    public String saveCatogery(@ModelAttribute("newcategory") Category category,
                               RedirectAttributes redirectAttributes){
        this.categoryService.save(category);
        redirectAttributes.addFlashAttribute("msg", "Adding Category Successfully!!!");
        return "redirect:/newcategory";
    }
}
