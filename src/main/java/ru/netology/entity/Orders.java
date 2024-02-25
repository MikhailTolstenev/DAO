package ru.netology.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    private Customers customer;
    @Id
    @GeneratedValue
    private  int id;
    @Column(name="date")
    private String date;
    @ManyToOne
    @JoinColumn (name="customer_id")
    int customer_id = customer.getId();
    @Column (name="product_name")
    private  String product_name;
    @Column (name="amount")
    private  int amount;
}
