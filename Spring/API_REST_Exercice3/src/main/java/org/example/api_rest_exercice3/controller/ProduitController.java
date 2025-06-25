package org.example.api_rest_exercice3.controller;


import jakarta.validation.Valid;
import org.example.api_rest_exercice3.dto.ProdReceiveDto;
import org.example.api_rest_exercice3.dto.ProdResponseDto;
import org.example.api_rest_exercice3.service.ProduitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit")
public class ProduitController {

    private ProduitService produitService;

    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }

    @PostMapping
    public ResponseEntity<ProdResponseDto> newProduct (@Valid @RequestBody ProdReceiveDto prodReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produitService.create(prodReceiveDto));
    }

    @GetMapping
    public ResponseEntity<List<ProdResponseDto>> getAll (){
        return ResponseEntity.ok(produitService.getList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(produitService.getById(id));
    }

}
