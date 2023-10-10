package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
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
import static com.example.jpastudy.entity.QTeam.team;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class JPA_join {
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
    Member m5 = new Member("m5", 30);
    Member m6 = new Member("m6", 40);

    em.persist(teamA);
    em.persist(teamB);
    em.persist(m1);
    em.persist(m2);
    em.persist(m3);
    em.persist(m4);
    em.persist(m5);
    em.persist(m6);
  }

  @Test
  public void innerJoin(){
    List<Member> result = query.selectFrom(member).innerJoin(member.team, team).where(team.name.eq("teamA")).fetch();

    assertThat(result).extracting("name").containsExactly("m1", "m2");
  }

  @Test
  public void leftJoin(){
    List<Tuple> result = query.select(member.name, member.team.name).from(member).leftJoin(member.team, team).where(team.name.eq("teamA").or(team.isNull())).fetch();

    for(Tuple tuple : result){
      String userName = tuple.get(member.name);
      String teamName = tuple.get(member.team.name);
      System.out.println("userName = " + userName + ", teamName = " + teamName);
    }

    assertThat(result).hasSize(4);
  }
}
