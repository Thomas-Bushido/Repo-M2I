package org.example.todo.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;


    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<TodoService> getlists() {
        return todoService.createTodo("test1", "ceci est un test", true);
    }

    @RequestMapping("/home/list")
    public String listInfos(Model model) {
        model.addAttribute("cooking", "faire des lasagnes");
        model.addAttribute("sport", "faire du vélo");
        List<String> todoList = List.of("faire des lasagnes", "faire du vélo", "partir en Inde");
        model.addAttribute("todoList", todoList);
        return "list/details";

    }

    @RequestMapping("/one/list")
    public String oneTodo(Model model) {
        model.getAttribute("cooking");
        List<String> todoList = List.of("faire des lasagnes", "faire du vélo", "partir en Inde");
        return "list/onelist";
    }

}