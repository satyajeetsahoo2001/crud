package com.project.studentData.College.clgRepo;

import com.project.studentData.College.clg.Clg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClgRepo extends JpaRepository<Clg,Integer> {
}
