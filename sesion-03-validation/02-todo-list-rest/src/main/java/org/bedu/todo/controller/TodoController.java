package org.bedu.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.bedu.todo.dto.CreateTodoDTO;
import org.bedu.todo.dto.TodoDTO;
import org.bedu.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;
    
    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll() {
        return todoService.getAll();
    }

    @RequestMapping("/crearTodo")
    public TodoDTO create(@Valid @RequestBody CreateTodoDTO data) {
        return todoService.create(data);
    }
}
