package org.bedu.todo.service;

import java.util.LinkedList;
import java.util.List;

import org.bedu.todo.dto.CreateTodoDTO;
import org.bedu.todo.dto.TodoDTO;
import org.bedu.todo.model.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private List<Todo> todos;
    private long currentId = 1l;

    public TodoService() {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Tarea de prueba", "Esto es una tarea de prueba", false));
    }

    public List<TodoDTO> getAll() {
        List<TodoDTO> data = new LinkedList<>();

        for (Todo model : todos) {
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
            data.add(dto);         
        }

        return data;
    }

    public TodoDTO create(CreateTodoDTO data) {
        Todo model = new Todo(++currentId, data.getTitle(), data.getDescription(), false);
        todos.add(model);

        TodoDTO dto = new TodoDTO();
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.isCompleted());

        return dto;
    }
}
