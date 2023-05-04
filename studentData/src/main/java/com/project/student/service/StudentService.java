package com.project.student.service;

import com.project.student.dto.CollegeDTO;
import com.project.student.dto.DepartmentDTO;
import com.project.student.dto.StudentDTO;
import com.project.student.entity.College;
import com.project.student.entity.Department;
import com.project.student.entity.Student;

import java.util.List;

public interface StudentService {
    ///save
    public Student saveStudent(StudentDTO studentDTO);
    //update
    public Student updateStudent(StudentDTO studentDTO);
    //get
    public List<Student> getStudent();
    //delete
    public void deleteStudent(Integer dId);
    //department
    ///save
    public Department saveDepartment(DepartmentDTO departmentDTO);
    //update
    public Department updateDepartment(DepartmentDTO departmentDTO);
    //get
    public List<Department> getAllDepartment();
    //delete
    public void deleteDept(Integer departmentId);
    //college
    //save
    public College saveCollege(CollegeDTO collegeDTO);
    //update
    public College updateCollege(CollegeDTO collegeDTO);
    //get
    public List<College> getAllCollege();
    //delete
    public void deleteClg(Integer collegeId);

}
