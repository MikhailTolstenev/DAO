package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.Entity;
import ru.netology.service.Service;

import java.util.List;

@RestController
@AllArgsConstructor

public class Controller {
    private Service service;
    @GetMapping("/persons/by-city")
    public List<Entity.Persons> getPersons(@RequestParam String city) {
        return service.getPersonsByCity(city);

}
        }
