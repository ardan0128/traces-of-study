package com.example.jpastudy.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name", "age"})
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "age")
  private int age;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "team_ID")
  private Team team;

  @OneToMany(mappedBy = "member")
  private List<Task> tasks = new ArrayList<>();

  public Member(String name){
    this(name, 0);
  }

  public Member(String name, int age){
    this(name, age, null);
  }

  public Member(String name, int age, Team team){
    this.name = name;
    this.age = age;

    if(team != null){
      changeTeam(team);
    }
  }

  public void changeTeam(Team team){
    this.team = team;
    team.getMembers().add(this);
  }
}
