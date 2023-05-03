package com.project.studentData.studentRepo;

import com.project.studentData.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
