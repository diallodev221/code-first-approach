package com.diallodev.codefirstapproch.todo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class TodoRepository {

    private static final List<Todo> todos = new ArrayList<>();

    static {
        todos.addAll(
                List.of(
                new Todo(UUID.randomUUID().toString(), "learn Java"),
                new Todo(UUID.randomUUID().toString(), "learn Spring Boot"),
                new Todo(UUID.randomUUID().toString(), "learn Python")
        ));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Todo create(String description) {
        var todo = new Todo(UUID.randomUUID().toString(), description);
        todos.add(todo);
        return todo;
    }


}
