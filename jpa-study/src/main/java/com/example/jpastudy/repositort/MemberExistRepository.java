package com.example.jpastudy.repositort;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.jpastudy.entity.QMember.member;

@Repository
@RequiredArgsConstructor
public class MemberExistRepository {
  private final JPAQueryFactory query;

  public Boolean existsByName(String name){
    Integer fetchOne = query.selectOne().from(member).where(member.name.eq(name)).fetchFirst();

    return fetchOne != null;
  }
}
