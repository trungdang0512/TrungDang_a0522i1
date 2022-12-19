package com.example.bt_sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sandwich {

    @GetMapping("/sandwich")
    public String param(){
        return "choose";
    }

    @GetMapping("/choose")
    public String chooseResult(Model model, @RequestParam("condiment") String[] condiment){
//        String condiment1 = condiment[0];
//        String condiment2 = condiment[1];
//        String condiment3 = condiment[2];
//        String condiment4 = condiment[3];
        model.addAttribute("condiment", condiment);
//        model.addAttribute("condiment2", condiment[1]);
//        model.addAttribute("condiment3", condiment[2]);
//        model.addAttribute("condiment4", condiment[3]);
        return "choose";
    }
}
