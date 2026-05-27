package com.example.session;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    // TODO: Todo 목록 저장용 List 만들기 ex) List<Todo> ..
    // TODO: GET /todos 구현하기
    // TODO: POST /todos 구현하기

    private final List<Todo> list;
    private int currentId;

    public TodoController(){
        list=new ArrayList<>();
        currentId = 1;
    }

    @GetMapping("/todos")
    public List<Todo> get(){
        return list;
    }

    @GetMapping("/todos/{id}")
    public Todo getById(@PathVariable int id){
        for (Todo todo : list) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null; 
    }

    @PostMapping("/todos")
    public Todo post(@RequestBody Todo todo){
        todo.setId(currentId++);
        list.add(todo);
        return todo;
    }

}