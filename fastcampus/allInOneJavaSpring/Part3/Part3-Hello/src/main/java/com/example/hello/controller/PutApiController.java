package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import com.example.hello.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto){
        System.out.println(putRequestDto);
        return putRequestDto;
    }

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId){
        System.out.println(userId);
        return putRequestDto;
    }

    @PutMapping("/put-user")
    public ResponseEntity<UserDto> put(@RequestBody UserDto userDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }
}
