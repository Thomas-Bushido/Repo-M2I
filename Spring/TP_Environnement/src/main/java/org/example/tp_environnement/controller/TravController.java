package org.example.tp_environnement.controller;

import jakarta.validation.Valid;
import org.example.tp_environnement.dto.travellog.TravReceiveDto;
import org.example.tp_environnement.dto.travellog.TravResponseDto;
import org.example.tp_environnement.service.TravService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travellog")
public class TravController {
    public TravService service;

    public TravController(TravService service){
        this.service = service;
    }
    //CREER UN TRAVELLOG
    @PostMapping
    public ResponseEntity<TravResponseDto> createTrav(@Valid @RequestBody TravReceiveDto travReceiveDto){
        System.out.println("controller create");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(travReceiveDto));
    }

    //LISTE DES TRAVELLOG
    @GetMapping
    public ResponseEntity<List<TravResponseDto>> getAllTrav(){
        System.out.println("controller liste");
        return ResponseEntity.ok(service.getList());
    }


}
