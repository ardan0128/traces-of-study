package com.example.jpastudy.config;

import com.example.jpastudy.entity.Member;
import com.example.jpastudy.entity.Task;
import com.example.jpastudy.entity.Team;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
  private final EntityManager em;
  private JPAQueryFactory query;

  @Override
  @Transactional
  public void run(String... args) throws Exception {
    initData();
  }

  public void initData() {
    query = new JPAQueryFactory(em);
    List<Team> teams = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      Team team = new Team("team" + (i + 1));
      em.persist(team);
      teams.add(team);
    }

    for (int i = 0; i < 100; i++) {
      Team team = teams.get(i % 10);
      Member member = new Member("member" + (i + 1), (i % 50) + 10, team); // 나이는 10~59로 설정
      em.persist(member);

      for (int j = 0; j < 2; j++) {
        String title = "task" + (i * 2 + j + 1);
        String statue = (j % 2 == 0) ? "PENDING" : "COMPLETED";
        Task task = new Task(title, statue, member);
        em.persist(task);
      }
    }
  }
}
