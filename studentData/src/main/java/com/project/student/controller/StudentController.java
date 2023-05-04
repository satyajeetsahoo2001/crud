package com.project.student.controller;

import com.project.student.College.clgDto.CollegeDTO;
import com.project.student.dept.deptDto.DepartmentDTO;
import com.project.student.dto.StudentDTO;
import com.project.student.entity.Student;
import com.project.student.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentServiceImpl;


    @PostMapping("/student/save")
    public ResponseEntity<Student> saveStudent(@RequestBody StudentDTO studentDTO){
        Student result=studentServiceImpl.saveStudent(studentDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("update/{dId}")
    public ResponseEntity<Student> updateStudent(@RequestBody StudentDTO dto, @PathVariable Integer Id, @RequestBody Integer dId, @RequestBody Integer clgId){

        Student result=impl1.updateStudent(dto,Id,dId,clgId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("get")
    public List<Student> getStudent(){
        List<Student> result=impl1.getStudent();
        return (List<Student>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer dId){
        impl1.deleteStudent(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }
    @PostMapping("save")
    public ResponseEntity<Dept> saveDept(@RequestBody DepartmentDTO dto){
        Dept result=impl.saveDept(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("update/{dId}")
    public ResponseEntity<Dept> updateDept(@RequestBody DepartmentDTO dto, @PathVariable Integer dId){

        Dept result=impl.updateDept(dto,dId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("get")
    public List<Dept> getClg(){
        List<Dept> result=impl.getDept();
        return (List<Dept>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete{dId}")
    public ResponseEntity<String> deleteClg(@PathVariable Integer dId){
        impl.deleteDept(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }
    @PostMapping("save")
    public ResponseEntity<Clg> saveClg(@RequestBody CollegeDTO dto){
        Clg result=impl.saveClg(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("update/{clgId}")
    public ResponseEntity<Clg> updateClg(@RequestBody CollegeDTO dto, @PathVariable Integer clgId){

        Clg result=impl.updateClg(dto,clgId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("get")
    public List<Clg> getClg(){
        List<Clg> result=impl.getClg();
        return (List<Clg>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete/{dId}")
    public ResponseEntity<String> deleteClg(@PathVariable Integer dId){
        impl.deleteClg(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }



}
