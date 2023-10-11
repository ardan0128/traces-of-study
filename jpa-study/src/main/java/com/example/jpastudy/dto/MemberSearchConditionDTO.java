package com.example.jpastudy.dto;

import lombok.Data;

@Data
public class MemberSearchConditionDTO {
  private String memberName;
  private String teamName;
  private Integer ageGoe;
  private Integer ageLoe;
}
