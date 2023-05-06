package com.aadhaarData.dto;

import lombok.Data;

@Data
public class CandidateDTO {
    private Integer candidateId;
    private String candidateName;
    private Long candidateAadhaarNumber;


    private Long  fatherAadhaarNumber;

}
