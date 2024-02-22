package ru.netology.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.netology.entity.Entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository

public class Repository {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Entity.Persons> getPersonsByCity(String city){
        var query = entityManager.createQuery("select p from Persons p where lower(p.cityOfLiving) = lower(:city)", Entity.Persons.class);
        query.setParameter("city",city);
        return query.getResultList();
}}
