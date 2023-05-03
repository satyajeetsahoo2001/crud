package com.project.studentData.dept.deptRepo;

import com.project.studentData.dept.dept.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepo extends JpaRepository<Dept,Integer> {
}
