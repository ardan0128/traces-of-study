package com.memberjava.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRequest {
    private String userId;
    private String password;
    private String name;
    private String regNo;
}
