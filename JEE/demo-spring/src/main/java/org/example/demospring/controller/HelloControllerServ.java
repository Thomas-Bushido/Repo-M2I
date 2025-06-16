package org.example.demospring.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerServ {


    private GreetinService greetinService;

    //@Autowired
    public HelloControllerServ(@Qualifier("greetings") GreetinService greetinService) {
        this.greetinService = greetinService;
    }

    @RequestMapping("/hello-set")
    public String sayHello(){
        System.out.println(greetinService.greet());
        return "hello";
    }
}
