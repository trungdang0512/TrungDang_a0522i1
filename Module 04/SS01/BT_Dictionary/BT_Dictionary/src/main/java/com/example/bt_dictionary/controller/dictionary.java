package com.example.bt_dictionary.controller;

import com.example.bt_dictionary.repo.dictionaryRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dictionary {
    private dictionaryRepo dictionaryRepo = new dictionaryRepo();

    @GetMapping("/dictionary")
    public String dictionary() {
        return "dictionary";
    }

    @PostMapping("translate")
    public String  translateWord(Model model,@RequestParam String txtSearch){
//        model.addAttribute("txtSearch", input);
        String search = String.valueOf(txtSearch);
        String result = this.dictionaryRepo.find(search);
        model.addAttribute("result", result);
        return "dictionary";
    }
}
