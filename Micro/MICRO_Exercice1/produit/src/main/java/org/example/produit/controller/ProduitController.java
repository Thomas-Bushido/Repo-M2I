package org.example.produit.controller;



import org.example.produit.model.Produit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    @GetMapping("/{id}")
    public Produit getProduct(@PathVariable int id) {
        return new Produit(id,"Kinder","Biscuit", 2.55);
    }
}