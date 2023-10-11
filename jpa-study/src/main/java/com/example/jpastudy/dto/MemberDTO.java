package com.example.jpastudy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDTO {
  private String name;
  private int age;

  public MemberDTO(String name, int age){
    this.name = name;
    this.age = age;
  }
}
