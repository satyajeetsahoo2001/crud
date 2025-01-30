package com.project.student.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "department")
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(name = "college_name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "depts")
    private List<Student> students;




}


