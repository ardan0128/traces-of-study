package com.example.jpastudy.repository;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface MemberRepositoryCustom {
  Page<Member> findAllWithTeam(MemberSearchConditionDTO condition, Pageable pageable);
  Slice<Member> findAllWithTeamSlice(MemberSearchConditionDTO condition, Pageable pageable);
}
