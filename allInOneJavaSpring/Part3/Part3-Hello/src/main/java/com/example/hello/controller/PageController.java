package com.example.hello.controller;

import com.example.hello.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public UserDto userDto(){
        UserDto userDto = new UserDto();
        userDto.setName("Jortier");
        return userDto;
    }
}
