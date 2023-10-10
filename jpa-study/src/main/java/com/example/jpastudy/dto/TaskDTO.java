package com.example.jpastudy.dto;

import com.example.jpastudy.entity.Task;
import lombok.Data;

@Data
public class TaskDTO {
  private String title;
  private String status;

  public TaskDTO(Task task) {
    this.title = task.getTitle();
    this.status = task.getStatus();
  }
}
