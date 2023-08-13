package com.example.marcus.model;

public class Task {

    public Task(final String id, final String name, final String status, final String hiddenField) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.hiddenField = hiddenField;
    }

    public String id;
    public String name;
    public String status;
    public String hiddenField;
}
