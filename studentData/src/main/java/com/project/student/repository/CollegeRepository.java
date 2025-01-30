package com.project.student.repository;

import com.project.student.College.clg.Clg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<Clg,Integer> {
}
