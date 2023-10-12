package com.example.jpastudy.service;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.dto.MemberTeamTaskDTO;
import com.example.jpastudy.entity.Member;
import com.example.jpastudy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  public Page<MemberTeamTaskDTO> findAllWithTeam(MemberSearchConditionDTO condition, Pageable pageable){
    Page<Member> members = memberRepository.findAllWithTeam(condition, pageable);
    return members.map(MemberTeamTaskDTO::new);
  }
}
