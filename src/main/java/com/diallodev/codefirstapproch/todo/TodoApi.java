package com.diallodev.codefirstapproch.todo;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/todos")
@Tag(name = "Todo API")
@SecurityRequirement(name = "api")
public interface TodoApi {

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<Todo> findAll();

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Todo create(@RequestBody String title);

}
