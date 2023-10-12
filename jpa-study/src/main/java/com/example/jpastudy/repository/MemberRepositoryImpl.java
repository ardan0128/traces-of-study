package com.example.jpastudy.repository;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.entity.Member;
import com.example.jpastudy.repository.support.Querydsl5RepositorySupport;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import static com.example.jpastudy.entity.QMember.member;
import static com.example.jpastudy.entity.QTeam.team;
import static org.springframework.util.StringUtils.hasText;

public class MemberRepositoryImpl extends Querydsl5RepositorySupport implements MemberRepositoryCustom {
    public MemberRepositoryImpl() {
      super(Member.class);
    }

    public Page<Member> findAllWithTeam(MemberSearchConditionDTO condition, Pageable pageable) {
      return this.applyPagination(pageable, contentQuery -> contentQuery
          .selectFrom(member)
          .innerJoin(member.team, team).fetchJoin()
          .where(
              memberNameEq(condition.getMemberName()),
              teamNameEq(condition.getTeamName()),
              ageGoe(condition.getAgeGoe()),
              ageLoe(condition.getAgeLoe())
          ), countQuery -> countQuery
          .select(member.id)
          .from(member)
          .innerJoin(member.team, team).fetchJoin()
          .where(
              memberNameEq(condition.getMemberName()),
              teamNameEq(condition.getTeamName()),
              ageGoe(condition.getAgeGoe()),
              ageLoe(condition.getAgeLoe())
          )
      );
    }

    // Predicate를 리턴하는것 보다 BooleanExpression을 리턴하는 것이 좋다. 조합이 가능하기 때문.
    // 아래의 메서드들은 재사용이 가능하다. 여러 조건이 있을 때 (날짜가 맞아야 하고 행사중이어야 하고) valid()로 만들어서 사용하면 편리함.
    private BooleanExpression memberNameEq(String name) {
      return hasText(name) ? member.name.eq(name) : null;
    }

    private BooleanExpression teamNameEq(String teamName) {
      return hasText(teamName) ? team.name.eq(teamName) : null;
    }

    private BooleanExpression ageGoe(Integer ageGoe) {
      return ageGoe != null ? member.age.goe(ageGoe) : null;
    }

    private BooleanExpression ageLoe(Integer ageLoe) {
      return ageLoe != null ? member.age.loe(ageLoe) : null;
    }
}
