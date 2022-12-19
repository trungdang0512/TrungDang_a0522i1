package com.example.bt_moneyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class moneyConverter {

    @GetMapping ("/money")
    public String convertMoney(){
        return "money";
    }

    @GetMapping("convert")
    public String convertMoney1(Model model, String usd, String rate){
        Float result = Float.parseFloat(rate)*Float.parseFloat(usd);
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("result",result);
        return "money";
    }
}
