package org.example.api_rest_exercice2.controller;

import org.example.api_rest_exercice2.dto.MovReceiveDto;
import org.example.api_rest_exercice2.dto.MovResponseDto;

import org.example.api_rest_exercice2.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("catalogue/films")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) { this.service = service;
    }
    @PostMapping
    public ResponseEntity<MovResponseDto> create (@RequestBody MovReceiveDto movReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(movReceiveDto));
    }

    @GetMapping
    public ResponseEntity<List<MovResponseDto>> getAll () {return ResponseEntity.ok(service.get());}

}
