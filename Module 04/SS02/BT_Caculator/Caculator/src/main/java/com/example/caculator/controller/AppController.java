package com.example.caculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @GetMapping("/app")
    public String param(){
        return "app";
    }

    @GetMapping("/caculate")
    public String addFunction(Model model, @RequestParam Float firstNumber,
                              @RequestParam Float secondNumber,
                              @RequestParam String operator){
        float result = 0;
        switch (operator){
            case "Addition(+)":
                result = firstNumber+secondNumber;
                break;
            case "Subtraction(-)":
                result = firstNumber-secondNumber;
                break;
            case "Multiplication(x)":
                result = firstNumber*secondNumber;
                break;
            case "Division(/)":
                result = firstNumber/secondNumber;
                break;
        }
        model.addAttribute("result", result);
        return "app";
    }

}
