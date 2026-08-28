package com.thiago.taskmanagement.service;
import com.thiago.taskmanagement.model.Task;
import com.thiago.taskmanagement.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {


    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;

    }

    public Task criarTask(Task task){
        return taskRepository.save(task);
    }

    public List<Task> mostrarTarefas() {
        return taskRepository.findAll();
    }


}
