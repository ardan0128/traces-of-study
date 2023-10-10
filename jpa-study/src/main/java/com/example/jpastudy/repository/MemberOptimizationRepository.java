package com.example.jpastudy.repository;

import com.example.jpastudy.entity.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.jpastudy.entity.QMember.member;
import static com.example.jpastudy.entity.QTeam.team;

@Repository
@RequiredArgsConstructor
public class MemberOptimizationRepository {
  private final JPAQueryFactory query;

  public List<Member> findAllWithTeam() {
    return query.selectFrom(member)
        .innerJoin(member.team, team).fetchJoin()
        .fetch();
  }
}
