package com.todolistapi.mapper;

import com.todolistapi.dto.TodoItemRequest;
import com.todolistapi.dto.TodoItemResponse;
import com.todolistapi.model.TodoItem;
import org.springframework.beans.BeanUtils;

public class TodoItemMapper {
    public TodoItemResponse toResponse(TodoItem todoItem){
        TodoItemResponse todoItemResponse = new TodoItemResponse();
        BeanUtils.copyProperties(todoItem, todoItemResponse);
        return todoItemResponse;
    }

    public TodoItem toEntity(TodoItemRequest todoItemRequest){
        TodoItem todoItem = new TodoItem();
        BeanUtils.copyProperties(todoItemRequest, todoItem);
        return todoItem;
    }
}
