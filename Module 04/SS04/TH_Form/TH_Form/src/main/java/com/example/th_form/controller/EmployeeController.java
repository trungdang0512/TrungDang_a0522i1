package com.example.th_form.controller;

import com.example.th_form.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping(value = "/showform")
    public String showForm(ModelMap model){
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping(value = "/addemployee")
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model){
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "info";
    }
}
