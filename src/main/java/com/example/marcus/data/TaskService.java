package com.example.marcus.data;

import com.example.marcus.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskService {

    public static List<Task> getTasks() {
        final List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(UUID.randomUUID().toString(), "Task1", "Green", "Secret Green"));
        tasks.add(new Task(UUID.randomUUID().toString(), "Task2", "Yellow", "Secret Yellow"));

        return tasks;
    }
}
