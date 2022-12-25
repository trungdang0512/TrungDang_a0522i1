package com.example.bt_sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping("/sandwich")
    public String param(){
        return "choose";
    }

    @GetMapping("/choose")
    public String chooseResult(Model model, @RequestParam("condiment") String[] condiment){
        model.addAttribute("condiment", condiment);
        return "choose";
    }
}
