package org.bedu.todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.bedu.todo.model.Todo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class TodoController {

    private List<Todo> todos;
    private long currentId = 1l;

    public TodoController() {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Tarea de prueba", "Esto es una tarea de prueba", false));
    }
    
    // Obtener todas las tareas
    // URL: http://localhost:8080/obtenerTodos
    @RequestMapping("/obtenerTodos")
    public List<Todo> getAll() {
        return todos;
    }

    /*
     * Un API tiene 4 maneras de recibir parámetros/datos
     * 
     * 1. Utilizando el QUERY STRING
     *  https://amazon.com.mx/productos ? key1=value1 & key2=value2 & key3=value3 & ...
     * 
     * El Query String se utiliza más para filtrado de datos, dichos son OPCIONALES.
     * 
     * 2. Utilizando un PATH VARIABLE
     *  https://amazon.com.mx/carrito/12345-67890
     * 
     * El Path Variable se utiliza más para obtener identificadores o valores cortos
     * 
     * 3. Utilizando el REQUEST BODY <------
     * 
     * 4. Utilizando los ENCABEZADOS
     */
    // Crear una nueva tarea
    @RequestMapping("/crearTodo")
    public Todo create(@Valid @RequestBody Todo data) {
        data.setCompleted(false);
        data.setId(++currentId);

        todos.add(data);

        return data;
    }


    // Marcar como completada una tarea

    // Obtener una sola tarea (por identificador)
}
