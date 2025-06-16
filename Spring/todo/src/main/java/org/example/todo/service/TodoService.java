package org.example.todo.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Builder
@Service
public class TodoService {
    public String name;
    public String description;
    public boolean isDone;

    private List<TodoService> todoServiceList;

    public TodoService(String name, String description, boolean isDone) {
        this.name = name;
        this.description = description;
        this.isDone = isDone;
    }

    public List<TodoService> createTodo(String name, String description, boolean isDone){

        todoServiceList.add(new TodoService(name, description, isDone));
        return todoServiceList;

    }


}