package org.example.tp_environnement.controller;

import jakarta.validation.Valid;
import org.example.tp_environnement.dto.observation.ObsReceiveDto;
import org.example.tp_environnement.dto.observation.ObsResponseDto;
import org.example.tp_environnement.dto.specy.SpecyReceiveDto;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;
import org.example.tp_environnement.service.ObsService;
import org.example.tp_environnement.service.SpecyService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/observation")
public class ObsController {
    public ObsService service;

    public ObsController(ObsService service){
        this.service = service;
    }

    //CREER UNE OBSERVATION
    @PostMapping
    public ResponseEntity<ObsResponseDto> createObs(@Valid @RequestBody ObsReceiveDto obsReceiveDto){
        System.out.println("controller create");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(obsReceiveDto));
    }

    //LISTE DES Observation
    @GetMapping
    public ResponseEntity<List<ObsResponseDto>> getAllObs(){
        System.out.println("controller liste");
        return ResponseEntity.ok(service.getList());
    }

    //OBTENIR PAR ID
    @GetMapping("/{id}")
    public ResponseEntity<ObsResponseDto> getOneSpecy(@PathVariable long id){
        return ResponseEntity.ok(service.getById(id));
    }
}
