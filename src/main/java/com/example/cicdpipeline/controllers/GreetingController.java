package com.example.cicdpipeline.controllers;

import com.example.cicdpipeline.models.Greeting;
import com.example.cicdpipeline.repositories.GreetingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private GreetingRepository greetingRepository;

    public GreetingController(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Greeting> greeting(){
        Greeting greeting = new Greeting("Hej fra server til Azure!");
        greetingRepository.save(greeting);
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
