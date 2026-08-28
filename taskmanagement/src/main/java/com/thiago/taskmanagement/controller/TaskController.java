package com.thiago.taskmanagement.controller;
import org.springframework.web.bind.annotation.*;
import com.thiago.taskmanagement.model.Task;
import com.thiago.taskmanagement.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping
    public Task criarTask( @RequestBody Task task){
        return taskService.criarTask(task);
    }

    @GetMapping
    public List<Task> obterTodos() {
        return taskService.mostrarTarefas();
    }


}
