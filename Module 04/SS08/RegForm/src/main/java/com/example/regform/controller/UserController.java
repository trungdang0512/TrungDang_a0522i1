package com.example.regform.controller;

import com.example.regform.model.User;
import com.example.regform.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/reg")
    public String getReg(Model model){
        User user = new User();
        model.addAttribute("newReg", user);
        return "reg";
    }

    @PostMapping("/submit")
    public String submitReg(@Valid @ModelAttribute("newReg") User user,
                            BindingResult bindingResult,
                            Model model){
        if (bindingResult.hasErrors()){
            return "reg";
        }
        this.userService.save(user);
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String resulPage(Model model){
        model.addAttribute("users", userService.getAll());
        return "/result";
    }
}
