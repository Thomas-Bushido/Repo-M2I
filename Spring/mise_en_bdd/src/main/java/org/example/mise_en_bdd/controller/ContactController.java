package org.example.mise_en_bdd.controller;

import jakarta.validation.Valid;
import org.example.mise_en_bdd.dao.ContactRepository;
import org.example.mise_en_bdd.entity.Contact;
import org.example.mise_en_bdd.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    //PAGE HOME
    @GetMapping
    public String home(){
        return "home";
    }

    // Page list des contacts
    @GetMapping("/listcontacts") // http://localhost:8080/students http://localhost:8080/students?search=toto
    public String showContacts(Model model){

            model.addAttribute("contacts",contactService.getAllContacts());

        return "list";
    }

    @GetMapping("/addform")
    public String addContact(Model model){
        model.addAttribute("contact", new Contact());
        return "form";
    }

    @PostMapping("/contacts")
    public String add(@ModelAttribute("contact") Contact contact){
       contactService.createContact(contact);
            return "redirect:/listcontacts";
    }

    @GetMapping("/pb")
    public String pb(){
        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
    }


}
