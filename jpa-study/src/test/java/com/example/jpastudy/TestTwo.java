package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Team;
import com.example.jpastudy.repositort.MemberExistRepository;
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
public class TestTwo {
  @Autowired
  EntityManager em;
  JPAQueryFactory query;

  @Autowired
  MemberExistRepository memberExistRepository;

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
  public void testCondition1(){
    Member findMember = query.selectFrom(member).where(member.name.eq("m1").and(member.age.eq(10))).fetchOne();

    assertThat(findMember.getName()).isEqualTo("m1");
  }

  @Test
  public void testCondition2(){
    Member findMember = query.selectFrom(member).where(member.name.eq("m1"), member.age.eq(10)).fetchOne();

    assertThat(findMember.getName()).isEqualTo("m1");
  }

  @Test
  public void exist(){
    String memberName = "m1";
    Member foundMember = query.selectFrom(member).where(member.name.eq(memberName)).fetchFirst();

    assertThat(foundMember).isNotNull();
    assertThat(foundMember.getName()).isEqualTo(memberName);
    assertThat(foundMember.getTeam().getName()).isEqualTo("teamA");

    Boolean exists1 = memberExistRepository.existsByName("m1");
    Boolean exists2 = memberExistRepository.existsByName("m10");

    assertThat(exists1).isTrue();
    assertThat(exists2).isFalse();
  }
}
