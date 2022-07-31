package com.herzbit.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/api/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> greetUser() {
        return new ResponseEntity<>("Hello, Welcome to CICD Demo", HttpStatus.OK);
    }
}