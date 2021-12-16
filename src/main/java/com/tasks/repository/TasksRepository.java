package com.tasks.repository;

import com.tasks.model.TasksModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository<TasksModel, Long> {

}
