package com.example.jpastudy.dto;

import com.example.jpastudy.entity.Member;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class MemberTeamTaskDTO {
  private Long memberId;
  private String username;
  private int age;
  private Long teamId;
  private String teamName;
  private List<TaskDTO> tasks;

  public MemberTeamTaskDTO(Member member) {
    this.memberId = member.getId();
    this.username = member.getName();
    this.age = member.getAge();
    this.teamId = member.getTeam().getId();
    this.teamName = member.getTeam().getName();
    // collection 조회
    this.tasks = member.getTasks().stream()
        .map(taskItem -> new TaskDTO(taskItem))
        .collect(Collectors.toList());
  }
}
