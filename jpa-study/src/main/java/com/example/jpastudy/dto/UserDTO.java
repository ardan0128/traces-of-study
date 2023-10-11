package com.example.jpastudy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
  private String userName;
  private int userAge;

  public UserDTO(String userName, int userAge){
    this.userName = userName;
    this.userAge = userAge;
  }
}
