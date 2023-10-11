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

@SpringBootTest
@Transactional
public class JPA_concat {
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
  public void concat(){
    List<String> result = query
        .select(member.name.concat("_").concat(member.age.stringValue()))
        .from(member)
        .where(member.name.eq("m1"))
        .fetch();

    for(String s : result){
      System.out.println(s);
    }
  }
}
