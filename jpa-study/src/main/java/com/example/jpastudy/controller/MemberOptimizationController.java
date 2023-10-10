package com.example.jpastudy.controller;

import com.example.jpastudy.dto.MemberTeamTaskDTO;
import com.example.jpastudy.service.MemberOptimizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberOptimizationController {
  private final MemberOptimizationService service;

  @GetMapping("/optimize")
  public List<MemberTeamTaskDTO> findAllWithTeamTask(){
    return service.findAllWithTeamTask();
  }
}
