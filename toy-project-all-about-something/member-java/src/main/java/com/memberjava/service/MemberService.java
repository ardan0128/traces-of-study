package com.memberjava.service;

import com.memberjava.dto.MemberRequest;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    public String signup(MemberRequest memberRequest){
        System.out.println(memberRequest.getName());

        return "";
    }
}
