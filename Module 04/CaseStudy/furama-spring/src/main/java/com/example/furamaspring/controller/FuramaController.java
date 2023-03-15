package com.example.furamaspring.controller;

import com.example.furamaspring.dto.ClientListDto;
import com.example.furamaspring.model.Client;
import com.example.furamaspring.service.IClientService;
import com.example.furamaspring.service.IClientTypeService;
import com.example.furamaspring.service.impl.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("")
public class FuramaController {
    @Autowired
    private IClientService clientService;
    @Autowired
    private IClientTypeService clientTypeService;

    @GetMapping("/client")
    public String getList(@RequestParam(value = "page", defaultValue = "0")int page, Model model){
        Sort sort = Sort.by("id").ascending();
        model.addAttribute("clientlist", clientService.getAllWithPage(PageRequest.of(page,10,sort)));
        return "client";
    }

    @GetMapping("/addclient")
    public String showCreateClient(Model model){
        model.addAttribute("newclient",new ClientListDto());
        model.addAttribute("typelist", clientTypeService.findAll());
        String[] listGender = {"Nam","Nữ"};
        model.addAttribute("listGender", listGender);
        return "addclient";
    }

    @PostMapping("/saveclient")
    public String saveNewClient(@Valid
                                @ModelAttribute("newclient") ClientListDto clientDto,
                                BindingResult bindingResult,
                                RedirectAttributes redirectAttributes,
                                Model model){
        if (bindingResult.hasErrors()){
//            model.addAttribute("newclient",new Client());
            model.addAttribute("typelist", clientTypeService.findAll());
            String[] listGender = {"Nam","Nữ"};
            model.addAttribute("listGender", listGender);
            return "addclient";
        }
        Client client1 = new Client();
        BeanUtils.copyProperties(clientDto, client1);

        clientService.save(client1);
        redirectAttributes.addFlashAttribute("msg", "Add New Customer Successfully!!!");
        return "redirect:/client";
    }

    @GetMapping("/editclient/{id}")
    public String showEditClient(@PathVariable("id") Long id, Model model){
        model.addAttribute("client", this.clientService.findById(id));
        model.addAttribute("typelist", clientTypeService.findAll());
        String[] listGender = {"Nam","Nữ"};
        model.addAttribute("listGender", listGender);
        return "editclient";
    }

    @PostMapping("/updateclient")
    public String saveUpdateClient(Client client,RedirectAttributes redirectAttributes){
        this.clientService.save(client);
        redirectAttributes.addFlashAttribute("msg", "Add New Customer Successfully!!!");
        return "redirect:/client";
    }

    @GetMapping("deleteClient")
    public String deleteClient(@RequestParam("deleteId") Long id,
                               RedirectAttributes redirectAttributes,
                               @RequestParam(value = "page",defaultValue = "0")int page,Model model){
        System.out.println(id);
        this.clientService.deleteById(id);
        Sort sort = Sort.by("id").ascending();
        model.addAttribute("clientlist", clientService.getAllWithPage(PageRequest.of(page,10,sort)));
        redirectAttributes.addFlashAttribute("msg", "Delete Customer Successfully!!!");
        return "redirect:/client";
    }

    @GetMapping("search")
    public String searchClientByName(@RequestParam(value = "page",defaultValue = "0")int page,Model model,
                                     @RequestParam(value = "name", defaultValue = "")String name){
        model.addAttribute("searchByName",name);
        model.addAttribute("clientlist",clientService.findAllByName(name,PageRequest.of(page,1)));
        return "client";
    }
}
