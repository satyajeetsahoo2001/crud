package com.aadhaarData.service;

import com.aadhaarData.dto.CandidateDTO;
import com.aadhaarData.dto.FathersDTO;
import com.aadhaarData.dto.MothersDTO;
import com.aadhaarData.entity.CandidateInformation;
import com.aadhaarData.entity.FathersInformation;
import com.aadhaarData.entity.MothersInformation;

import java.util.List;

public interface CandidateService {


    //father
    //SAVE FATHER DATA
    public FathersInformation saveFatherData(FathersDTO fathersDTO);
    //UPDATE FATHER DATA
    public FathersInformation updateFatherData(FathersDTO fathersDTO);
    //GET FATHER DATA BY AADHAAR NUMBER
    public FathersInformation getFatherDataByAadhaar(Integer id);
    //GET ALL FATHER DATA
    public List<FathersInformation> getALLFatherData();
    //DELETE ALL FATHER DATA AADHAR NUMBER
    public String deleteFatherData(Integer fatherAadhaarNumber);

    //mother
    //SAVE MOTHER DATA
    public MothersInformation saveMotherData(MothersDTO mothersDTO);
    //UPDATE MOTHER DATA
    public MothersInformation updateMotherData(MothersDTO mothersDTO);
    //GET MOTHER DATA BY AADHAAR NUMBER
    public MothersInformation getMotherDataByAadhaar(Integer id);
    //GET ALL MOTHER DATA
    public List<MothersInformation> getAllMotherData();
    //DELETE MOTHER DATA BY AADHAAR NUMBER
    public String deleteMotherData(Integer motherAadhaarNumber);

    //CANDIDATE
    //SAVE FATHER DATA
    public CandidateInformation saveCandidateData(CandidateDTO candidateDTO);
    //UPDATE FATHER DATA
    public CandidateInformation updateCandidateData(CandidateDTO candidateDTO);
    //GET FATHER DATA BY AADHAAR NUMBER
    public CandidateInformation getCandidateDataByAadhaar(Integer id);
    //GET ALL FATHER DATA
    public List<CandidateInformation> getALLCandidateData();
    //DELETE ALL FATHER DATA AADHAR NUMBER
    public String deleteCandidateData(Integer candidateAadhaarNumber);
}
