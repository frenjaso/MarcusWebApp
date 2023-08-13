package com.example.marcus.apicontroller;

import com.example.marcus.data.TaskService;
import com.example.marcus.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskApiController {

    @GetMapping("/api/tasks")
    public List<Task> getTasks() {
        final List<Task> tasks = TaskService.getTasks();
        return tasks;
    }
}
