package com.workshop.spring_security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/greetings")
public class GreetingsController {
    
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hi, from our API");
    }
    
    @GetMapping("/bye-bye")
    public ResponseEntity<String> sayGoodBye() {
        return  ResponseEntity.ok("bye and see you later");
    }
}
