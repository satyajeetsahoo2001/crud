package com.example.crud.service;

import com.example.crud.dto.Dto;
import com.example.crud.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

public interface Service {
    //save
public Student saveDetails(Dto dto);
    //update
    public Student upadateDetails(Dto dto,Integer id);
    //get
    public List<Student> fetchDetails();
    //delete
    public void deleteStudent(Integer id);

}
