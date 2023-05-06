package com.aadhaarData.repository;

import com.aadhaarData.entity.CandidateInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateInformation,Integer> {
    CandidateInformation findByAadhaarNumber(Long candidateAadhaarNumber);
}
