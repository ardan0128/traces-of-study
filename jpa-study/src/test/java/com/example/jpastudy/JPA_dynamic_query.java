package com.example.jpastudy;

import com.example.jpastudy.dto.MemberSearchConditionDTO;
import com.example.jpastudy.dto.MemberSearchResultDTO;
import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Team;
import com.example.jpastudy.repository.MemberDynamicQueryRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class JPA_dynamic_query {
  @Autowired
  EntityManager em;
  JPAQueryFactory query;
  @Autowired
  MemberDynamicQueryRepository memberDynamicQueryRepository;

  @BeforeEach
  public void before(){
    query = new JPAQueryFactory(em);
    Team teamA = new Team("teamA");
    Team teamB = new Team("teamB");
    Member m1 = new Member("m1", 10, teamA);
    Member m2 = new Member("m2", 20, teamA);
    Member m3 = new Member("m3", 30, teamB);
    Member m4 = new Member("m4", 40, teamB);

    em.persist(teamA);
    em.persist(teamB);
    em.persist(m1);
    em.persist(m2);
    em.persist(m3);
    em.persist(m4);
  }

  @Test
  public void search(){
    MemberSearchConditionDTO condition = new MemberSearchConditionDTO();

    condition.setAgeGoe(35);
    condition.setAgeLoe(40);
    condition.setTeamName("teamB");

    List<MemberSearchResultDTO> result = memberDynamicQueryRepository.search(condition);

    assertThat(result).extracting("memberName").containsExactly("m4");
  }
}
