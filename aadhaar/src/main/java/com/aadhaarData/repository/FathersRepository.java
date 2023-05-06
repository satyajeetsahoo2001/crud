package com.aadhaarData.repository;

import com.aadhaarData.entity.CandidateInformation;
import com.aadhaarData.entity.FathersInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FathersRepository extends JpaRepository<FathersInformation,Integer> {

    FathersInformation findByAadhaarNumber(Long fatherAadhaarNumber);
}
