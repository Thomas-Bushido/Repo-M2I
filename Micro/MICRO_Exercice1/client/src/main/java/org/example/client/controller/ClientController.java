package org.example.client.controller;


import org.example.client.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")

public class ClientController {
    @GetMapping("/{id}")
    public Client getCustomer(@PathVariable int id) {
        return new Client(id,"John","Doe", "1 rue de la garde");
    }
}
