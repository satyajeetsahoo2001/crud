package com.project.studentData.student;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.dept.dept.Dept;
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
    private String name;
    private Date dob;
    private String father;

@ManyToOne
    private Dept depts;

@ManyToOne
    private Clg clgs;


}
