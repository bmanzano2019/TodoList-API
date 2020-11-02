package com.todolistapi.dto;

public class TodoItemResponse {
    Integer id;
    String text;
    Boolean done;

    public TodoItemResponse(Integer id, String text, Boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public TodoItemResponse(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
