package com.project.studentData.studentController;

import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptDto.DeptDto;
import com.project.studentData.dept.deptServiceImpl.DeptServiceImpl;
import com.project.studentData.student.Student;
import com.project.studentData.studentDto.StudentDto;
import com.project.studentData.studentServiceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentServiceImpl impl1;
    @PostMapping("save/{dId}/{clgId}")
    public ResponseEntity<Student> saveStudent(@RequestBody StudentDto dto,@PathVariable Integer dId,@PathVariable Integer clgId){
        Student result=impl1.saveStudent(dto,dId,clgId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @PutMapping("update/{dId}")
    public ResponseEntity<Student> updateStudent(@RequestBody StudentDto dto, @PathVariable Integer Id,@RequestBody Integer dId,@RequestBody Integer clgId){

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

}
