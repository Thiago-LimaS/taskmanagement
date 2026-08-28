package com.thiago.taskmanagement.repository;
import com.thiago.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task , Long> {


}
