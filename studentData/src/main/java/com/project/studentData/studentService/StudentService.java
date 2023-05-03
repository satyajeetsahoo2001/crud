package com.project.studentData.studentService;

import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptDto.DeptDto;
import com.project.studentData.student.Student;
import com.project.studentData.studentDto.StudentDto;

import java.util.List;

public interface StudentService {
    ///save
    public Student saveStudent(StudentDto dto,Integer dId,Integer ClgId);
    //update
    public Student updateStudent(StudentDto dto, Integer Id,Integer dId,Integer clgId);
    //get
    public List<Student> getStudent();
    //delete
    public void deleteStudent(Integer dId);
}
