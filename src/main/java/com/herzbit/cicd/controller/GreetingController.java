package com.herzbit.cicd.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    private static final Logger LOGGER = LogManager.getLogger(GreetingController.class);

    @GetMapping
    public ResponseEntity<String> greetUser() {
        LOGGER.info("Hello World !");
        return new ResponseEntity<>("Hello, Welcome to CICD Demo", HttpStatus.OK);
    }
}
