package org.example.todo.controller;


import org.example.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    private final TodoService todoService;
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping("/todo")
    public String getOneTodo(Model model){
        System.out.println(" cette route doit renvoyer vers une page qui affiche une seule todo");
         return "todo";
    }


    @RequestMapping("/todos")
    public String getAllTodos(Model model){
        System.out.println("cette route dois renvoyer vers une page qui affiche toute les todos");
        model.addAttribute("todos",todoService.getTodos());
        return "todos";
    }
}
