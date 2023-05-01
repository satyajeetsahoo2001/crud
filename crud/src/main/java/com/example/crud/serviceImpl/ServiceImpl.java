package com.example.crud.serviceImpl;

import com.example.crud.dto.Dto;
import com.example.crud.entity.Student;
import com.example.crud.repo.Repo;
import com.example.crud.service.Service;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Autowired
    private Repo repo;
    //save
    @Override
    public Student saveDetails(Dto dto){
        Student student=new Student();
        student.setName(dto.getName());
        student.setId(dto.getId());
        student.setAge(dto.getAge());
        return (Student) repo.save(student);
    }
    //update

    @Override
    public Student upadateDetails(Dto dto,Integer id){

        Student student1= (Student) repo.findById(id).get();

    if (Objects.nonNull(dto.getName()) && !" ".equalsIgnoreCase(dto.getName())&&Objects.nonNull(dto.getAge())) {
        student1.setName(dto.getName());
        student1.setAge(dto.getAge());
    }
        return (Student) repo.save(student1);

    }
    //get

    @Override
    public List<Student> fetchDetails(){
return (List<Student>) repo.findAll();
    }
    //delete

    @Override
    public void deleteStudent(Integer id){
repo.deleteById(id);

    }

}
