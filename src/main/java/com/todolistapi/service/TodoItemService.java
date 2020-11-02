package com.todolistapi.service;

import com.todolistapi.repository.TodoItemRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoItemService {

    private TodoItemRepository todoItemRepository;

    public TodoItemService(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

}
