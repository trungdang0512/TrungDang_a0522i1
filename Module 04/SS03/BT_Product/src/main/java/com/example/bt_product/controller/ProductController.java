package com.example.bt_product.controller;

import com.example.bt_product.model.Product;
import com.example.bt_product.service.IProductService;
import com.example.bt_product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    IProductService productService = new ProductService();

    @GetMapping("/product")
    public String index(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "/product";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String saveProduct(Product product){
        product.setId((int) (Math.random()*10000));
        productService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String viewProduct(@PathVariable int id, Model model){
        Product findProduct =  productService.findById(id);
        model.addAttribute("product", findProduct );
        return "/view";
    }

    @GetMapping("/{id}/edit")
    public String editProduct(@PathVariable int id, Model model){
        Product findProduct =  productService.findById(id);
        model.addAttribute("product", findProduct );
        return "/edit";
    }

    @PostMapping("/update")
    public String updateProduct(Product product){
        productService.update(product.getId(),product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable int id){
        productService.remove(id);
        return "redirect:/product";
    }
}
