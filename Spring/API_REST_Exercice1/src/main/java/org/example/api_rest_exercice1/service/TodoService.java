package org.example.api_rest_exercice1.service;

import org.example.api_rest_exercice1.dto.TodoReceiveDto;
import org.example.api_rest_exercice1.dto.TodoResponseDto;
import org.example.api_rest_exercice1.entity.Todo;
import org.example.api_rest_exercice1.exception.NotFoundException;
import org.example.api_rest_exercice1.repository.TodoRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoResponseDto create (TodoReceiveDto todoReceiveDto){
        return todoRepository.save(todoReceiveDto.dtoToEntity()).entityToDto();
    }

    public TodoResponseDto get(long id){
        return todoRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<TodoResponseDto> get(){
        return todoRepository.findAll().stream().map(Todo::entityToDto).toList();
    }

    public TodoResponseDto update (long id, TodoReceiveDto todoReceiveDto){
        Todo todoFound = todoRepository.findById(id).orElseThrow(NotFoundException::new);
        Todo todoGet = todoReceiveDto.dtoToEntity();
        todoFound.setTitre(todoGet.getTitre());
        todoFound.setDescription(todoGet.getDescription());
        todoFound.setDate(todoGet.getDate());
        return todoRepository.save(todoFound).entityToDto();
    }

    public void delete (long id) {todoRepository.deleteById(id);}
}
