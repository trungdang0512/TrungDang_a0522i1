package com.example.bt_mail.controller;

import com.example.bt_mail.model.Mail;
import com.example.bt_mail.service.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
    @Autowired
    private MailServiceImpl mailService;

    @GetMapping("/mail")
    public String mail(@ModelAttribute("currentMail") Mail currentMail, ModelMap model){
        currentMail = mailService.display();
        model.addAttribute("language",currentMail.getLanguage());
        model.addAttribute("pageSize",currentMail.getPageSize());
        model.addAttribute("enableSpam",currentMail.getEnableSpam());
        model.addAttribute("signature",currentMail.getSignature());
        return "mail";
    }

    @GetMapping("/edit")
    public ModelAndView showEditForm(){
        Mail currentMail = mailService.display();
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("newMail", currentMail);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editSetting( @ModelAttribute("newMail") Mail mail){
        mailService.save(mail);
        Mail newMail = mailService.display();
        ModelAndView modelAndView = new ModelAndView("/mail");
        modelAndView.addObject("newMai", newMail);
        return modelAndView;
    }
}
