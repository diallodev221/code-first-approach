package com.diallodev.codefirstapproch.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController implements TodoApi {

    private final TodoService service;

    @Override
    public List<Todo> findAll() {
        return service.findAll();
    }

    @Override
    public Todo create(String title) {
       return service.create(title);
    }
}
