package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.jpastudy.entity.QMember.member;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class TestOne {
  @Autowired
  EntityManager em;
  JPAQueryFactory query;

  @BeforeEach
  public void before(){
    query = new JPAQueryFactory(em);
    Team teamA = new Team("teamA");
    Team teamB = new Team("teamB");

    em.persist(teamA);
    em.persist(teamB);

    Member m1 = new Member("m1", 10, teamA);
    Member m2 = new Member("m2", 20, teamA);
    Member m3 = new Member("m3", 30, teamB);
    Member m4 = new Member("m4", 40, teamA);

    em.persist(m1);
    em.persist(m2);
    em.persist(m3);
    em.persist(m4);
  }

  @Test
  public void startQueryDsl() throws Exception{
    Member findMember = query.select(member).from(member).where(member.name.eq("m1")).fetchOne();

    assertThat(findMember.getName()).isEqualTo("m1");
  }
}
