package org.example.commande.controller;

import org.example.commande.model.Client;
import org.example.commande.model.Commande;
import org.example.commande.model.Produit;
import org.example.commande.util.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/commande")

public class CommandeController {
    private final RestTemplate restTemplate = new RestTemplate();


    @GetMapping("/{id}")
    public Commande getCommande(@PathVariable int id){
        Commande commande = new Commande();
        commande.setId(id);
        commande.setReference("XUV516");
        Client client = restTemplate.getForObject(
                "http://localhost:8080/client/{id}",
                Client.class,
                id
        );
        commande.setClient(client);
        /*
        Produit produit = restTemplate.getForObject(
                "http://localhost:8080/produit/{id}",
                Produit.class,
                id
        );
        commande.setProduit(produit);
        */

        return commande;
    }
/*
    @GetMapping("/detail/{id}")
    public Commande getOrder(@PathVariable int id){
        Commande commande= new Commande();
        commande.setId(id);
        commande.setReference("XUV516");
        RestClient<Client> clientRestClient = new RestClient<>("http://localhost:8080/client/7");
        Client client = clientRestClient.get(Client.class);
        commande.setClient(client);

        return commande;
    }
    */

}
