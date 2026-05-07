package com.example.lab_docker_compose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons") // http://localhost:8080/persons
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    //  GET http://localhost:8080/persons
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // POST http://localhost:8080/persons
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }
}
