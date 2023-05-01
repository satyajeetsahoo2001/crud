package com.example.crud.controller;

import com.example.crud.dto.Dto;
import com.example.crud.entity.Student;
import com.example.crud.serviceImpl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/crud")//it will get the request from the url (how it will put,p[ost,,get,delete)
public class Conntroller {
    @Autowired
    ServiceImpl serviceimpl;


    //save
    @PostMapping("/save")//(it will get and handle the save request from the url)
    public ResponseEntity<Student> saveDetails(@RequestBody Dto dto){
        Student s1=serviceimpl.saveDetails(dto);
        return ResponseEntity.status(HttpStatus.OK).body(s1);
    }
    //update
    @PutMapping("update/{id}")//(it will get and handle  the update request from the url  )
    public ResponseEntity<Student> upadateDetails(@RequestBody Dto dto,@PathVariable Integer id){
        Student s1=serviceimpl.upadateDetails(dto,id);
        return ResponseEntity.status(HttpStatus.OK).body(s1);
    }

    //fetch
@GetMapping("get")
    public ResponseEntity<List<Student>> fetchDetails(){
        List<Student> s1=serviceimpl.fetchDetails();
        return ResponseEntity.status(HttpStatus.OK).body(s1);
    }
    //delete
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        serviceimpl.deleteStudent(id);

        return ResponseEntity.status(HttpStatus.OK).body("Delete data succesfully of  this id" + id);

    }}
