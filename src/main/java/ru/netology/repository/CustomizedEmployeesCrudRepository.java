package ru.netology.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.netology.entity.PersonKey;
import ru.netology.entity.Persons;


import java.util.*;

@Repository

public interface CustomizedEmployeesCrudRepository extends PagingAndSortingRepository<Persons, PersonKey> {
    List<Persons> findByNameAndSurname(String name, String Surname);

    List<Persons> findByCity(String city);
    List<Persons> findByAge(int age);



}
