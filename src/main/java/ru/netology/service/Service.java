package ru.netology.service;

import lombok.AllArgsConstructor;
import ru.netology.entity.Orders;
import ru.netology.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private Repository repository;

    public List<Orders> getProductName(String name) {

        return repository.getProductName(name);
    }
}