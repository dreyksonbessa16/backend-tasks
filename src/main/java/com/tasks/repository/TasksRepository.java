package com.tasks.repository;

import com.tasks.model.TasksModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TasksRepository extends JpaRepository<TasksModel, Long> {

    @Query(value = "SELECT * FROM tasks a where a.date_tasks = date(now()) order by a.hour_tasks;", nativeQuery = true)
    List<TasksModel> getTaskToday();
}
