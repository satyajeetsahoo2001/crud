package com.library.studentdata.student;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "studentData")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
}
