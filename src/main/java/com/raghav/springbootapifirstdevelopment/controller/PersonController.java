package com.raghav.springbootapifirstdevelopment.controller;

import com.raghav.springbootapifirstdevelopment.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {
    Logger logger = LoggerFactory.getLogger(PersonController.class);
    @PostMapping("/person")
    public Person person(@Valid @RequestBody Person person) {
        logger.info("Person: "+person);
        return person;
    }
}
