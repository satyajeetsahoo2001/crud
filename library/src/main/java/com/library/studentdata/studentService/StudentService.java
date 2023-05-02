package com.library.studentdata.studentService;

import com.library.studentdata.student.Student;
import com.library.studentdata.studentDto.StudentDto;

import java.util.List;

public interface StudentService {
//    save
    public Student saveStudent(StudentDto dto);
    //update
    public Student updateStudent(StudentDto dto,Integer id);

    //delete
    public void deleteStudent(Integer id);
    //get
    public List<Student> getStudent();
    //getById
    public Student getStudentById(Integer id);

}
