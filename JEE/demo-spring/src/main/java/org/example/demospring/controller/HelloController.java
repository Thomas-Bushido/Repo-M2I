package org.example.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String sayHello(){
        System.out.println("je passe dans la méthode say hello");
        return "hello";
    }
    @RequestMapping("/coucou")
    @ResponseBody
    public List<String> getPersons(){
        return List.of("toto","tata","titi");
    }
    @RequestMapping("/home/person")
    public String personInfos(Model model){
        model.addAttribute("firstname", "toto");
        List<String> persons = List.of();
        return "person/details";
    }
}
