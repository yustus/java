package de.wad.simpleProject.controller;

import de.wad.simpleProject.entity.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping(
            method =  RequestMethod.GET,
            path = "/person",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person getPerson(){

        List skills = new ArrayList<String>();
        skills.add("Spring Boot");
        skills.add("Java");

        String vorname = "Alex";
        String nachname = "Mustermann";

        Person person = new Person(vorname, nachname, skills);

        return person;
    }

}
