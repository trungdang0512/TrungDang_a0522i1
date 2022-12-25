package com.example.bt_dictionary.controller;

import com.example.bt_dictionary.Service.DictionaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryServiceImpl dictionaryService;

    @GetMapping("/dictionary")
    public String dictionary() {
        return "dictionary";
    }

    @PostMapping("translate")
    public String  translateWord(Model model,@RequestParam String txtSearch){
//        model.addAttribute("txtSearch", input);
        String search = String.valueOf(txtSearch);
        String result = this.dictionaryService.find(search);
        model.addAttribute("result", result);
        return "dictionary";
    }
}
