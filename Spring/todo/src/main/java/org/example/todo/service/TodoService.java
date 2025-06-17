package org.example.todo.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Service
public class TodoService {


    private ArrayList<Todo> todos =new ArrayList<>();


    public TodoService() {
       this.todos.add(new Todo("td1", "description", true));
        this.todos.add(new Todo("td2", "description", true));
        this.todos.add(new Todo("td3", "description", true));
    }



    }


