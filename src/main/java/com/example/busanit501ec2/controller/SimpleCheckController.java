package com.example.busanit501ec2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCheckController {

    // 브라우저에서 http://localhost:8080/ping 으로 접속 테스트
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}