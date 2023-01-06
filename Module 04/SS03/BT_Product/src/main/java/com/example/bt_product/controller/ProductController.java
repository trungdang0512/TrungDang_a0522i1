package com.example.bt_product.controller;

import com.example.bt_product.model.Product;
import com.example.bt_product.service.IProductService;
import com.example.bt_product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/product")
    public String getList(Model model){
        model.addAttribute("products", productService.findAll());
        return "/product";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String saveProduct(Product product){
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
        productService.update(product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable int id){
        productService.remove(id);
        return "redirect:/product";
    }

    @GetMapping("/find/{id}")
    public String findProductByName(Model model, @RequestParam("name") String name){
//        Product findProduct = productService.findByName(name);
//        ModelAndView modelAndView = new ModelAndView("/product");
//        modelAndView.addObject("findProduct", findProduct);
//        modelAndView.addObject("name", name);
        if (name.isEmpty()){
            model.addAttribute("products",productService.findAll());
        }else{
            List<Product> find =  productService.findByName(name);
            model.addAttribute("products",find);
        }
        return "/product";
    }
}
