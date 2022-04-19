package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, String> requestData){
        requestData.entrySet().forEach(entry -> {
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        });
    }

    @PostMapping("/post-dto")
    public void postDto(@RequestBody PostRequestDto postRequestDto){
        System.out.println(postRequestDto);
    }
}
