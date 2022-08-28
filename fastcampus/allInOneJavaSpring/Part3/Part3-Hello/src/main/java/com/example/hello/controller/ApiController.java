package com.example.hello.controller;

import com.example.hello.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController // 해당 클래스는 REST API를 처리하는 Controller
@RequestMapping("/api") // URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello spring boot!";
    }

    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto userDto){
        return userDto;
    }
}
