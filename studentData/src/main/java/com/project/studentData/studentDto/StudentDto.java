package com.project.studentData.studentDto;

import lombok.Data;

import java.util.Date;
@Data
public class StudentDto {
    private Integer id;
    private String name;
    private Date dob;
    private String father;
}
