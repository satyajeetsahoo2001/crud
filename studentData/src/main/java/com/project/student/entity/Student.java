package com.project.student.entity;

import com.project.student.College.clg.Clg;
import com.project.student.dept.dept.Dept;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private Date dob;
    @Column(name = "father's_name")
    private String father;
    @ManyToOne
    private Dept depts;
    @ManyToOne
    private Clg clgs;


}
