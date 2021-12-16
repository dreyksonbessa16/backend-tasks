package com.tasks.model;

import com.tasks.enums.StatusTasks;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tasks")
public class TasksModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name_tasks", nullable = false, length = 50)
    private String nameTasks;
    @Column(name = "description_tasks", nullable = false, length = 200)
    private String descriptionTasks;
    @Column(name = "date_tasks", nullable = false, length = 8)
    private Date dateTasks;
    @Column(name = "hour_tasks", nullable = false)
    private Time hourTasks;
    @Column(name = "status_tasks", nullable = false)
    private StatusTasks statusTasks;
}
