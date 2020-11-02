package com.todolistapi.controller;

import com.todolistapi.dto.TodoItemRequest;
import com.todolistapi.dto.TodoItemResponse;
import com.todolistapi.mapper.TodoItemMapper;
import com.todolistapi.model.TodoItem;
import com.todolistapi.service.TodoItemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/todos")
public class TodoItemController {
    private final TodoItemService todoItemService;
    private final TodoItemMapper todoItemMapper;

    public TodoItemController(TodoItemService todoItemService, TodoItemMapper todoItemMapper) {
        this.todoItemService = todoItemService;
        this.todoItemMapper = todoItemMapper;
    }

    @GetMapping
    public List<TodoItemResponse> getAll() {
        List<TodoItem> todoItems = todoItemService.getAll();
        return todoItems.stream().map(todoItemMapper::toResponse).collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItemResponse addTodoItem(@RequestBody TodoItemRequest todoItemRequest) {
        TodoItem todoItem =todoItemService.create(todoItemMapper.toEntity(todoItemRequest));
        return todoItemMapper.toResponse(todoItem);
    }
}
