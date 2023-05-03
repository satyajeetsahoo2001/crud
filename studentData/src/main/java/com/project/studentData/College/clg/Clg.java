package com.project.studentData.College.clg;

import com.project.studentData.student.Student;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "college_Table")

public class Clg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer clgId;
    private String clgName;


    @OneToMany(mappedBy = "clgs")
    private List<Student> studentc;

}
