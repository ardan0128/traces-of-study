package com.example.jpastudy.repository;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MemberRepositoryCustom {
  Page<Member> findAllWithTeam(MemberSearchConditionDTO condition, Pageable pageable);
}
