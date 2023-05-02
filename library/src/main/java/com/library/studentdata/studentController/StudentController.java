package com.library.studentdata.studentController;

import com.library.studentdata.student.Student;
import com.library.studentdata.studentserviceImpl.StudentServiceImpl;
import com.library.studentdata.studentDto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/studentData")
public class StudentController {
    @Autowired
    StudentServiceImpl impl;
    @PostMapping("saveStudent")
    public ResponseEntity<Student>  saveStudent(@RequestBody StudentDto dto){//here i will get the name
        Student s1=impl.saveStudent(dto);
       return ResponseEntity.status(HttpStatus.OK).body(s1);
    }
@PutMapping("updateStudent/{id}")
    public ResponseEntity<Student>  updateStudent(@RequestBody StudentDto dto,@PathVariable Integer id){//here i will get the name ands id
        Student s1=impl.updateStudent(dto,id);
      return   ResponseEntity.status(HttpStatus.OK).body(s1);
    }

    @DeleteMapping("deleteStudent/{id}")
    public ResponseEntity<String>  deleteStudent(@PathVariable Integer id){//here i will get the id
        impl.deleteStudent(id);
        return   ResponseEntity.status(HttpStatus.OK).body("deleted");
    }

    @GetMapping("getStudent")
    public ResponseEntity<List<Student>>  getStudent(){
        List<Student> s1=impl.getStudent();
        return   ResponseEntity.status(HttpStatus.OK).body(s1);
    }
    @GetMapping("getStudentById/{id}")
    public ResponseEntity<Student>  getStudentById(@PathVariable Integer  id){
        Student s1= (Student) impl.getStudentById(id);
        return   ResponseEntity.status(HttpStatus.OK).body(s1);
    }
}
