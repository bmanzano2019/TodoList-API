package com.todolistapi.repository;

import com.todolistapi.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Integer> {
}
