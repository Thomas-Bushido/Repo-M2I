package org.example.api_rest_exercice2.controller;

import org.example.api_rest_exercice2.dto.DirReceiveDto;
import org.example.api_rest_exercice2.dto.DirResponseDto;
import org.example.api_rest_exercice2.model.Director;
import org.example.api_rest_exercice2.service.DirectorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("catalogue/realisateurs")
    public class DirectorController {

        private final DirectorService service;

        public DirectorController(DirectorService service) { this.service = service;
        }
        @PostMapping
        public ResponseEntity<DirResponseDto> create (@RequestBody DirReceiveDto dirReceiveDto){
            return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dirReceiveDto));
        }

        @GetMapping
        public ResponseEntity<List<DirResponseDto>> getAll () {return ResponseEntity.ok(service.get());}

        /*
        @GetMapping("/{id}")
        public ResponseEntity<DirResponseDto> get (@PathVariable long id) {return ResponseEntity.ok(service.get(id));
        }
        */



}
