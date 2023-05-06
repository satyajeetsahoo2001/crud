package com.aadhaarData.repository;

import com.aadhaarData.entity.MothersInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Mothersrepository extends JpaRepository<MothersInformation,Integer> {
    MothersInformation findByAadhaarNumber(Long motherAadhaarNumber);
}
