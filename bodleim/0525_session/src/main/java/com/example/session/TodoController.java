package com.example.session;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private final List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todos;
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
        return todo;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodo(@PathVariable Long id) {
        for (Todo todo : todos) {
            if (todo.getId().equals(id)) {
                return todo;
            }
        }

        return null;
    }
}
