package com.fitness.appointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Member.java
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member {

    @Id
    private int id;
    private String name;
    private String gender;
    private String phone;
    private int age;

}
