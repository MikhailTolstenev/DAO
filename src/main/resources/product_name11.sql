select product_name from a1.orders B
         inner join a1.customers A on B.customer_id = A.id
where lower(A.name) = lower (:name);