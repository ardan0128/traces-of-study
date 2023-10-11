package com.example.jpastudy.dto;

import lombok.Data;

@Data
public class MemberSearchResultDTO {
  private Long memberId;
  private String memberName;
  private int age;
  private Long teamId;
  private String teamName;

  public MemberSearchResultDTO(Long memberId, String memberName, int age, Long teamId, String teamName){
    this.memberId = memberId;
    this.memberName = memberName;
    this.age = age;
    this.teamId = teamId;
    this.teamName = teamName;
  }
}
