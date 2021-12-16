package com.tasks.controller;

import com.tasks.model.TasksModel;
import com.tasks.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private TasksRepository tasksRepository;

    @PostMapping("")
    public TasksModel postTask(@RequestBody TasksModel tasksModel){

        return tasksRepository.save(tasksModel);
    }
}
