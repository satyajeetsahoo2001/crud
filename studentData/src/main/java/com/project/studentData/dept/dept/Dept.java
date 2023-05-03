package com.project.studentData.dept.dept;

import com.project.studentData.student.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
    @Data
    @Table(name = "Dept_Table")
public class Dept {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  Integer dId;
        private String dName;

        @OneToMany(mappedBy = "depts")
        private List<Student> studentd;




}
