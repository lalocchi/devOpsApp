package com.example.lab_docker_compose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return personRepository.findById(1L)
                .map(person -> "Hello, " + person.getName() + "!")
                .orElse("Hello, World!");
    }
}