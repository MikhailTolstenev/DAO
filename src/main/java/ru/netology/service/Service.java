package ru.netology.service;

import lombok.AllArgsConstructor;
import ru.netology.entity.Entity;
import ru.netology.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private Repository repository;

    public List<Entity.Persons> getPersonsByCity(String city) {

        return repository.getPersonsByCity(city);
    }
}