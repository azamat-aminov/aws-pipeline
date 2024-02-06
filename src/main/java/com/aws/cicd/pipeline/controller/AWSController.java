package com.aws.cicd.pipeline.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class AWSController {

    @GetMapping("")
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(Map.of("Testing", "UP and RUNNING..."));
    }

}