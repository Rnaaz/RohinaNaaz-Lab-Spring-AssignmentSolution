package com.greatlearning.CollegeFestEvent.entity;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String country;
    private String department;

    public Student(String name, String department, String country) {
        this.name = name;
        this.department = department;
        this.country = country;
    }
}

