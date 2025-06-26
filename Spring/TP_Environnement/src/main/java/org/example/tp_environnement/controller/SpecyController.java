package org.example.tp_environnement.controller;

import jakarta.validation.Valid;
import org.example.tp_environnement.dto.specy.SpecyReceiveDto;
import org.example.tp_environnement.dto.specy.SpecyResponseDto;
import org.example.tp_environnement.service.SpecyService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/especes")
public class SpecyController {

    public SpecyService service;

    public SpecyController(SpecyService service){
        this.service = service;
    }

    //CREER UNE ESPECE
    @PostMapping
    public ResponseEntity<SpecyResponseDto> createSpecy(@Valid @RequestBody SpecyReceiveDto specyReceiveDto){
        System.out.println("controller create");
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(specyReceiveDto));
    }

    //LISTE DES ESPECES
    @GetMapping
    public ResponseEntity<List<SpecyResponseDto>> getAllSpecies(){
        System.out.println("controller liste");
        return ResponseEntity.ok(service.getList());
    }

    //OBTENIR PAR ID
    @GetMapping("/{id}")
    public ResponseEntity<SpecyResponseDto> getOneSpecy(@PathVariable long id){
        return ResponseEntity.ok(service.getById(id));
    }

    //MODIFIER UNE ESPECE
    @PutMapping("/{id}")
    public ResponseEntity<SpecyResponseDto> updateSpecy (@PathVariable long id, @RequestBody SpecyReceiveDto specyReceiveDto){
        System.out.println("controller update");
        return ResponseEntity.ok(service.update(id, specyReceiveDto));
    }

    //SUPPRIMER UNE ESPECE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete (@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok("Deleted") ;
    }
}
