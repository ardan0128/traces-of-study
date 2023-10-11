package com.example.jpastudy;

import com.example.jpastudy.dto.MemberDTO;
import com.example.jpastudy.dto.UserDTO;
import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Team;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Projections;
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
public class JPA_DTO {
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
  public void projectionsBean(){
    List<MemberDTO> result = query
        .select(Projections.bean(MemberDTO.class, member.name, member.age))
        .from(member)
        .fetch();

    for(MemberDTO memberDTO : result){
      System.out.println("memberDTO = " + memberDTO);
    }
  }

  @Test
  public void projectionsFields(){
    List<MemberDTO> result = query
        .select(Projections.fields(MemberDTO.class, member.name, member.age))
        .from(member)
        .fetch();

    for(MemberDTO memberDTO : result){
      System.out.println("memberDTO = " + memberDTO);
    }
  }

  @Test
  public void projectionConstructor(){
    List<MemberDTO> result = query
        .select(Projections.constructor(MemberDTO.class, member.name, member.age))
        .from(member)
        .fetch();

    for(MemberDTO memberDTO : result){
      System.out.println("memberDTO = " + memberDTO);
    }
  }

  @Test
  public void userDTOFields(){
    List<UserDTO> result = query
        .select(Projections.fields(UserDTO.class, member.name.as("userName"), member.age.as("userAge")))
        .from(member)
        .fetch();

    for(UserDTO userDTO : result){
      System.out.println("userDTO = " + userDTO);
    }
  }

  @Test
  public void userDTOExpressionUtils(){
    List<UserDTO> result = query
        .select(Projections.fields(
            UserDTO.class,
            ExpressionUtils.as(member.name, "userName"),
            ExpressionUtils.as(member.age, "userAge")
        ))
        .from(member)
        .fetch();

    for(UserDTO userDTO : result){
      System.out.println("userDTO = " + userDTO);
    }
  }
}
