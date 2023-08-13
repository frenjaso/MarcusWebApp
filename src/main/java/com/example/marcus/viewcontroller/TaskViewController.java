package com.example.marcus.viewcontroller;

import com.example.marcus.data.TaskService;
import com.example.marcus.model.Task;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TaskViewController {
    private final ObjectMapper mapper = new ObjectMapper();

    @GetMapping("/tasks")
    public ModelAndView getTasksPage() throws JsonProcessingException {
        final Map<String, Object> model = new HashMap<>();


        final List<Task> tasks = TaskService.getTasks();
        model.put("tasks", tasks);
        model.put("tasksJson", mapper.writeValueAsString(tasks));

        final ModelAndView modelAndView = new ModelAndView("schedule", model);
        return modelAndView;
    }
}
