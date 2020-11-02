package com.todolistapi.controller;

import com.todolistapi.mapper.TodoItemMapper;
import com.todolistapi.service.TodoItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
public class TodoItemController {
    private final TodoItemService todoItemService;
    private final TodoItemMapper todoItemMapper;

    public TodoItemController(TodoItemService todoItemService, TodoItemMapper todoItemMapper) {
        this.todoItemService = todoItemService;
        this.todoItemMapper = todoItemMapper;
    }
}
