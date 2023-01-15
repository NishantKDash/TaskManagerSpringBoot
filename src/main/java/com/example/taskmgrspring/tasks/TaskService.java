package com.example.taskmgrspring.tasks;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService (TaskRepository taskRepository)
    {
        this.taskRepository = taskRepository;
    }

    public TaskEntity createTask(String title , String description , Date dueDate)
    {
        TaskEntity task = new TaskEntity();
        task.setTitle(title);
        task.setCompleted(false);
        task.setDescription(description);
        task.setDueDate(dueDate);
        return taskRepository.save(task);
    }
}
