package org.example.api_rest_exercice1.controller;

import org.example.api_rest_exercice1.dto.TodoReceiveDto;
import org.example.api_rest_exercice1.dto.TodoResponseDto;
import org.example.api_rest_exercice1.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service) { this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponseDto>> getAll () {return ResponseEntity.ok(service.get());}

    @GetMapping("/{id}")
    public ResponseEntity<TodoResponseDto> get (@PathVariable long id) {return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<TodoResponseDto> create (@RequestBody TodoReceiveDto todoReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(todoReceiveDto));
    }
}
