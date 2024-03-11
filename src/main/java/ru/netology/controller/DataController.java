package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.netology.entity.Persons;
import ru.netology.service.DataService;

import java.util.List;

@RestController
@AllArgsConstructor

public class DataController {
    private DataService dataService;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam String city) {
        return dataService.findByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getPersons1(@RequestParam int age) {
        return dataService.findByAge(age);
    }
    @GetMapping("/persons/by-name")
    public List<Persons> getPersons2(@RequestParam String name, String surname) {
        return dataService.findByNameAndSurname(name,surname);
    }


}
