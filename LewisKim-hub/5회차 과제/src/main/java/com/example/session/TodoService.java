package com.example.session;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private final List<Todo> todoList = new ArrayList<>();
    private Long nextId = 1L;

    public List<Todo> getTodos() {
        return todoList;
    }

    public Todo createTodo(Todo todo) {
        todo.setId(nextId++);
        todoList.add(todo);
        return todo;
    }

    public Todo getTodoById(Long id) {
        return todoList.stream()
                .filter(todo -> todo.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("해당 id가 없습니다: " + id));
    }
}