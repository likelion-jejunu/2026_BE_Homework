package com.example.session;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    // TODO: Todo 목록 저장용 List 만들기 ex) List<Todo> ..
    private final List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    // TODO: GET /todos 구현하기
    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return todos;
    }
    // TODO: POST /todos 구현하기
    @PostMapping("/todos")
    public Todo addTodos(@RequestBody Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
        return todo;
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable Long id){
        for (Todo todo : todos){
            if (todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }
}