package com.example.jpastudy.service;

import com.example.jpastudy.dto.MemberTeamTaskDTO;
import com.example.jpastudy.entity.Member;
import com.example.jpastudy.repository.MemberOptimizationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberOptimizationService {
  private final MemberOptimizationRepository repository;

  public List<MemberTeamTaskDTO> findAllWithTeamTask(){
    List<Member> members = repository.findAllWithTeam();

    List<MemberTeamTaskDTO> result = members.stream()
        .map(member -> new MemberTeamTaskDTO(member))
        .collect(Collectors.toList());
    return result;
  }
}
