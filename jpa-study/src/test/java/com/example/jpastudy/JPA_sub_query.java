package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.QMember;
import com.example.jpastudy.entity.Team;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.jpastudy.entity.QMember.member;
import static com.querydsl.jpa.JPAExpressions.select;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class JPA_sub_query {
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
  public void whereSubQuery(){
    QMember subMember = new QMember("subMember");
    List<Member> result = query
        .selectFrom(member)
        .where(member.age.eq(
            select(subMember.age.max()).from(subMember)
        ))
        .fetch();

    assertThat(result).extracting("age").containsExactly(40);

    result = query
        .selectFrom(member)
        .where(member.age.goe(
            select(subMember.age.avg())
                .from(subMember)
        ))
        .fetch();

    assertThat(result).extracting("age").containsExactly(30, 40);

    result = query
        .selectFrom(member)
        .where(member.age.in(
            select(subMember.age)
                .from(subMember)
                .where(subMember.age.gt(10))
        ))
        .fetch();

    assertThat(result).extracting("age").containsExactly(20, 30, 40);
  }

  @Test
  public void selectSubQuery(){
    QMember subMember = new QMember("subMember");
    List<Tuple> result = query
        .select(
            member.name,
            select(subMember.age.avg())
                .from(subMember)
        )
        .from(member)
        .fetch();

    for(Tuple tuple : result){
      System.out.println("tuple = " + tuple);
    }
  }
}
