package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.jpastudy.entity.QMember.member;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class Test3_fetch {
  @Autowired
  EntityManager em;
  JPAQueryFactory query;

  @BeforeEach
  public void before(){
    query = new JPAQueryFactory(em);
    Team teamA = new Team("teamA");
    Team teamB = new Team("teamB");
    Member m1 = new Member("m1", 10, teamA);
    Member m2 = new Member("m2", 10, teamA);
    Member m3 = new Member("m3", 10, teamA);
    Member m4 = new Member("m4", 10, teamA);

    em.persist(teamA);
    em.persist(teamB);
    em.persist(m1);
    em.persist(m2);
    em.persist(m3);
    em.persist(m4);
  }

  @Test
  @DisplayName("fetch 결과 조회")
  public void fetch(){
    List<Member> fetch = query.selectFrom(member).fetch();

    assertThat(fetch.size()).isEqualTo(4);
  }

  @Test
  public void fetchOne(){
    Exception exception = assertThrows(Exception.class, () -> {
      Member findMember = query.selectFrom(member).fetchOne();
    });
    String expectedMessage = "NonUniqueResultException";
    String actualMessage = exception.getMessage();

    assertTrue(actualMessage.contains(expectedMessage));
  }

  @Test
  public void fetchFirst(){
    Member findMember = query.selectFrom(member).fetchFirst();

    assertThat(findMember instanceof Member);
  }

  @Test
  public void contentCount(){
    List<Member> content = query.selectFrom(member).fetch();
    Long totalCount = query.select(member.count()).from(member).fetchOne();

    assertThat(content.size()).isEqualTo(4);
    assertThat(totalCount == 4);
  }
}
