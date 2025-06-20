package org.example.mise_en_bdd.controller;

import jakarta.validation.Valid;
import org.example.mise_en_bdd.dao.ContactRepository;
import org.example.mise_en_bdd.entity.Contact;
import org.example.mise_en_bdd.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @GetMapping
    public String home(Model model){
        model.addAttribute("contacts",contactService.findAll());
        return "home";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("contact",new Contact());
        return "form";
    }

    @PostMapping("/form")
    public String addContact(@ModelAttribute("contact") Contact contact){
        contactService.save(contact);
        return "redirect:/";
    }

    @PostMapping("/form")
    public String add(@Valid @ModelAttribute("contact") Contact contact, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "form";
        }else {
            return "form-confirm";
        }
    }

    @GetMapping("/pb")
    public String pb(){
        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
    }


}
