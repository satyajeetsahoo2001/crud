package com.project.student.dto;

import lombok.Data;

import java.util.Date;
@Data
public class StudentDTO {
    private Integer id;
    private String name;
    private Date dob;
    private String father;
}
