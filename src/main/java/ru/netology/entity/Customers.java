package ru.netology.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Customers {

    @Id
    @GeneratedValue
    private  int id;
    @Column (name="name")
    private String name;
    @Column (name="surname")
    private String surname;
    @Column (name="age")
    private  int age;
    @Column (name="phone_number")
    private  int phoneNumber;
}
