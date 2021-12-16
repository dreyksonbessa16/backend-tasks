package com.tasks.controller;

import com.tasks.model.TasksModel;
import com.tasks.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @Autowired
    private TasksRepository tasksRepository;

    @PostMapping("")
    public TasksModel postTask(@RequestBody TasksModel tasksModel){

        return tasksRepository.save(tasksModel);
    }

    @GetMapping("")
    public List<TasksModel> getTaskAll(){

        return tasksRepository.findAll();
    }

    @GetMapping("/today")
    public List<TasksModel> getTaskToday(){

        return tasksRepository.getTaskToday();
    }

    @GetMapping("/{id}")
    public TasksModel getTaskById(@PathVariable Long id){

        Optional<TasksModel> taskFind = tasksRepository.findById(id);

        if (taskFind.isPresent()){

            return taskFind.get();
        }
        return null;
    }
}
