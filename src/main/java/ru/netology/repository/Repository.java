package ru.netology.repository;


import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository

public class Repository {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String scriptSelectFileName = "product_name11.sql";
    private String script = read(scriptSelectFileName);

    public Repository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    public List<String> getProductName(String name) {
        MapSqlParameterSource param = new MapSqlParameterSource("name", name);
       return namedParameterJdbcTemplate.queryForList(script , param, String.class);
//        return Collections.singletonList(name);
    }
    public static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
