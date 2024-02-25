package ru.netology.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.netology.entity.Orders;

import java.util.*;

@org.springframework.stereotype.Repository

public class Repository {
    @PersistenceContext
    private EntityManager entityManager;



    public List<Orders> getProductName(String name) {
        var query = entityManager.createQuery("select product_name from Orders B\n" +
                        "         inner join Customers A on B.customer_id = A.id\n" +
                        "where lower(A.name) = lower (:name)",
                Orders.class);
        query.setParameter("name",name);
        return query.getResultList();

    }

    }

