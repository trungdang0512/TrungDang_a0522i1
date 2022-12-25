package com.example.caculator.controller;

import com.example.caculator.service.AppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
    @Autowired
    public AppServiceImpl appService;
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
                result=appService.addFuction(firstNumber,secondNumber);
                break;
            case "Subtraction(-)":
                result=appService.subFuction(firstNumber,secondNumber);
                break;
            case "Multiplication(x)":
                result=appService.mulFuction(firstNumber,secondNumber);
                break;
            case "Division(/)":
                result=appService.divFuction(firstNumber,secondNumber);
                break;
        }
        model.addAttribute("result", result);
        return "app";
    }

}
