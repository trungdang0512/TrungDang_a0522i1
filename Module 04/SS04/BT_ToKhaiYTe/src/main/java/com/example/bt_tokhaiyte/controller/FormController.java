package com.example.bt_tokhaiyte.controller;

import com.example.bt_tokhaiyte.model.CovidForm;
import com.example.bt_tokhaiyte.service.FormServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    private FormServiceImpl formService;

    @GetMapping("/form")
    public String showForm(@ModelAttribute("currentForm")CovidForm form, ModelMap model){
        model.addAttribute("name", form.getName());
        model.addAttribute("birthDate", form.getBirthDate());
        model.addAttribute("gender", form.getGender());
        model.addAttribute("nationality", form.getNationality());
        model.addAttribute("id", form.getId());
        model.addAttribute("vehicle", form.getVehicle());
        model.addAttribute("vehicleId", form.getVehicleId());
        model.addAttribute("vehicleChair", form.getVehicleChair());
        model.addAttribute("departDate", form.getDepartDate());
        model.addAttribute("arriveDate", form.getArriveDate());
        model.addAttribute("cityArrived", form.getCityArrived());
        model.addAttribute("city", form.getCity());
        model.addAttribute("district", form.getDistrict());
        model.addAttribute("ward", form.getWard());
        model.addAttribute("address", form.getAddress());
        model.addAttribute("phoneNumber", form.getPhoneNumber());
        model.addAttribute("email", form.getEmail());
        model.addAttribute("symptom",form.getSymptom());
        model.addAttribute("exposureNo1", form.getExposureNo1());
        model.addAttribute("exposureNo2", form.getExposureNo2());
        return "form";
    }

    @GetMapping("/update")
    public ModelAndView showForm(){
        CovidForm form = formService.displayForm();
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject("form", form);
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView editForm(@ModelAttribute("newForm") CovidForm newForm){
        formService.updateForm(newForm);
        newForm = formService.displayForm();
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("currentForm", newForm);
        return modelAndView;
    }
}
