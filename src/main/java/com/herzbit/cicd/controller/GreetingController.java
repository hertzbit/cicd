package com.herzbit.cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> greetUser() {
        System.out.println ("Hello World");
        return new ResponseEntity<>("Hello, Welcome to CICD Demo", HttpStatus.OK);
    }
}
