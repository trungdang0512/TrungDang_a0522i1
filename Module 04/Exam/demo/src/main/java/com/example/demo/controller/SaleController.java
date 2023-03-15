package com.example.demo.controller;

import com.example.demo.model.Sale;
import com.example.demo.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class SaleController {
    @Autowired
    private ISaleService saleService;

    @GetMapping("/sale")
    public String getList(Model model, @RequestParam(defaultValue = "") String q){
        model.addAttribute("q", q);
        model.addAttribute("salelist", saleService.findAll());
        return "sale";
    }

    @GetMapping("/addSale")
    public String showAdd(Model model){
        model.addAttribute("newSale",new Sale());
        return "addSale";
    }

    @PostMapping("/saveNew")
    public String saveNewSale(@Valid @ModelAttribute("newSale") Sale sale,
                              BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            return "addSale";
        }
        saleService.save(sale);
        redirectAttributes.addFlashAttribute("msg", "Add New Sale Program Successfully!!!");
        return "redirect:/sale";
    }

    @GetMapping("/editsale/{id}")
    public String showEdit(@PathVariable("id") Long id, Model model){
        model.addAttribute("sale", saleService.findById(id));
        return "editSale";
    }

    @PostMapping("/update")
    public String updateEdit(@Valid @ModelAttribute("newSale") Sale sale,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if (bindingResult.hasErrors()){
            return "ediSale";
        }
        saleService.save(sale);
        redirectAttributes.addFlashAttribute("msg", "Edit Sale Program Successfully!!!");
        return "redirect:/sale";
    }

   @GetMapping("deleteSale")
    public String deleteSale(@RequestParam("deleteId") Long id,
                             RedirectAttributes redirectAttributes, Model model){
        saleService.deleteById(id);
       redirectAttributes.addFlashAttribute("msg", "Delete Sale Program Successfully!!!");
       return "redirect:/sale";
   }

   @GetMapping("searchprice")
    public String search(Model model,
                         @RequestParam(value = "price", defaultValue = "")Integer price){
        model.addAttribute("salelist",saleService.findByPrice(price));
        return "redirect:/sale";
   }

    @GetMapping("searchstart")
    public String search(Model model,
                         @RequestParam(value = "start", defaultValue = "")String start){
        model.addAttribute("salelist",saleService.findByStart(start));
        return "redirect:/sale";
    }


}
