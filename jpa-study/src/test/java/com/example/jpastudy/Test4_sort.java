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

import java.util.List;

import static com.example.jpastudy.entity.QMember.member;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class Test4_sort {
  @Autowired
  EntityManager em;
  JPAQueryFactory query;

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
  public void sort(){
    em.persist(new Member(null, 100));
    em.persist(new Member("m5", 100));
    em.persist(new Member("m6", 100));

    List<Member> members = query.selectFrom(member).where(member.age.eq(100)).orderBy(member.age.desc(), member.name.asc().nullsLast()).fetch();
    Member m5 = members.get(0);
    Member m6 = members.get(1);
    Member mNull = members.get(2);

    assertThat(m5.getName()).isEqualTo("m5");
    assertThat(m6.getName()).isEqualTo("m6");
    assertThat(mNull.getName()).isNull();
  }
}
