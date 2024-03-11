package ru.netology.service;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.entity.Persons;
import ru.netology.repository.CustomizedEmployeesCrudRepository;


import java.util.List;

@Service
@AllArgsConstructor
public class DataService {
    private CustomizedEmployeesCrudRepository repository;

    public List<Persons> findByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Persons> findByAge(int age) {
        return repository.findByAge(age);
    }

    public List<Persons> findByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}