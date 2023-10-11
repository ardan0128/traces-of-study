package com.example.jpastudy.repository;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.dto.MemberSearchResultDTO;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.jpastudy.entity.QMember.member;
import static com.example.jpastudy.entity.QTeam.team;
import static org.springframework.util.StringUtils.hasText;

@Repository
@RequiredArgsConstructor
public class MemberDynamicQueryRepository {
  private final JPAQueryFactory query;

  public List<MemberSearchResultDTO> search(MemberSearchConditionDTO condition){
    return query
        .select(Projections.constructor(
            MemberSearchResultDTO.class,
            member.id,
            member.name,
            member.age,
            team.id,
            team.name
        ))
        .from(member)
        .leftJoin(member.team, team)
        .where(
            memberNameEq(condition.getMemberName()),
            ageGoe(condition.getAgeGoe()),
            ageLoe(condition.getAgeLoe()),
            teamNameEq(condition.getTeamName())
        )
        .fetch();
  }

  private BooleanExpression memberNameEq(String name){
    return hasText(name) ? member.name.eq(name) : null;
  }

  private BooleanExpression teamNameEq(String name){
    return hasText(name) ? team.name.eq(name) : null;
  }

  private BooleanExpression ageGoe(Integer ageGoe){
    return ageGoe != null ? member.age.goe(ageGoe) : null;
  }

  private BooleanExpression ageLoe(Integer ageLoe){
    return ageLoe != null ? member.age.loe(ageLoe) : null;
  }
}
