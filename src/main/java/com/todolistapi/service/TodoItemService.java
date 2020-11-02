package com.todolistapi.service;

import com.todolistapi.model.TodoItem;
import com.todolistapi.repository.TodoItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoItemService {
    private TodoItemRepository todoItemRepository;

    public TodoItemService(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> getAll() {
        return todoItemRepository.findAll();
    }

    public TodoItem create(TodoItem item) {
        return todoItemRepository.save(item);
    }
}
