package com.example.session;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    // Todo 목록 저장용 List
    private final List<Todo> todos = new ArrayList<>();

    // id 자동 부여용
    private Long sequence = 1L;

    // GET /todos - 저장된 Todo 목록 전체 반환
    @GetMapping
    public List<Todo> getTodos() {
        return todos;
    }

    // POST /todos - 새로운 Todo 추가 후 반환
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        todo.setId(sequence);   // id를 자동으로 부여
        sequence = sequence + 1;
        todos.add(todo);
        return todo;
    }

    // GET /todos/{id} - id로 특정 Todo 조회
    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable Long id) {
        for (Todo todo : todos) {
            if (todo.getId().equals(id)) {
                return todo;
            }
        }
        return null;
    }
}
