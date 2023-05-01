package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private  String name;
private Integer age;
}
