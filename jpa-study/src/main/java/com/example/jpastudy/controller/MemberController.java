package com.example.jpastudy.controller;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.dto.MemberTeamTaskDTO;
import com.example.jpastudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
  private final MemberService memberService;

  // controller의 파라미터로 Pageable을 주면 URI에서 받는 페이징 관련 파라미터가 자동으로 Pageable에 매핑된다.
  // ex) http://localhost:8090/support/members?teamName=team10&page=0&size=3&sort=id,desc&sort=username,desc

  @GetMapping("/page/members")
  public Page<MemberTeamTaskDTO> findAllWithTeam(
      MemberSearchConditionDTO condition,
      @PageableDefault(size = 5, sort = "name", direction = Sort.Direction.ASC) Pageable pageable) {
    return memberService.findAllWithTeam(condition, pageable);
  }

  @GetMapping("/slice/members")
  public Slice<MemberTeamTaskDTO> findAllWithTeamSlice(
      MemberSearchConditionDTO condition,
      Pageable pageable
  ) {
    return memberService.findAllWithTeamSlice(condition, pageable);
  }
}
