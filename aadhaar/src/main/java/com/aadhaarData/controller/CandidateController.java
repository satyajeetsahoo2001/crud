package com.aadhaarData.controller;

import com.aadhaarData.dto.CandidateDTO;
import com.aadhaarData.dto.FathersDTO;
import com.aadhaarData.dto.MothersDTO;
import com.aadhaarData.entity.CandidateInformation;
import com.aadhaarData.entity.FathersInformation;
import com.aadhaarData.entity.MothersInformation;
import com.aadhaarData.serviceImpl.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CandidateController {
    @Autowired
    CandidateServiceImpl candidateServiceImpl;

    //mother
    @PostMapping("save/mother")
    public ResponseEntity<MothersInformation>  saveMotherData (@RequestBody MothersDTO mothersDTO){
        MothersInformation result=candidateServiceImpl.saveMotherData(mothersDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }
    @PutMapping("update/mother")
     public ResponseEntity<MothersInformation>updateMotherData(@RequestBody MothersDTO mothersDTO){
            MothersInformation result=candidateServiceImpl.updateMotherData(mothersDTO);
            return ResponseEntity.status(HttpStatus.OK).body(result);

    }
@GetMapping("get/mother/{id}")
    public ResponseEntity<MothersInformation>  getMotherDataByAadhaar (@PathVariable Integer id){
            MothersInformation result=candidateServiceImpl.getMotherDataByAadhaar(id);
            return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @GetMapping("get/mother")
    public ResponseEntity<List<MothersInformation>>  getAllMotherData(){
        List<MothersInformation> result=candidateServiceImpl.getAllMotherData();
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @DeleteMapping("delete/mother/{id}")
    public ResponseEntity<String>  deleteMotherData (@PathVariable Integer id){
        String s1=candidateServiceImpl.deleteMotherData(id);
        return ResponseEntity.status(HttpStatus.OK).body(s1);

    }
//father
@PostMapping("save/father")
public ResponseEntity<FathersInformation>  saveFatherData (@RequestBody FathersDTO fathersDTO){
    FathersInformation result=candidateServiceImpl.saveFatherData(fathersDTO);
    return ResponseEntity.status(HttpStatus.OK).body(result);

}
    @PutMapping("update/father")
    public ResponseEntity<FathersInformation>updateFatherData(@RequestBody FathersDTO fathersDTO){
        FathersInformation result=candidateServiceImpl.updateFatherData(fathersDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }
    @GetMapping("get/father/{id}")
    public ResponseEntity<FathersInformation>  getFatherDataByAadhaar (@PathVariable Integer id){
        FathersInformation result=candidateServiceImpl.getFatherDataByAadhaar(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @GetMapping("get/father")
    public ResponseEntity<List<FathersInformation>>  getALLFatherData(){
        List<FathersInformation> result=candidateServiceImpl.getALLFatherData();
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @DeleteMapping("delete/father/{id}")
    public ResponseEntity<String>  deleteFatherData (@PathVariable Integer id){
        String s1=candidateServiceImpl.deleteMotherData(id);
        return ResponseEntity.status(HttpStatus.OK).body(s1);

    }

    //candidate
        @PostMapping("save/candidate")
    public ResponseEntity<CandidateInformation>  saveCandidateData (@RequestBody CandidateDTO candidateDTO){
            CandidateInformation result=candidateServiceImpl.saveCandidateData(candidateDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }
    @PutMapping("update/candidate")
    public ResponseEntity<CandidateInformation>updateCandidateData(@RequestBody CandidateDTO candidateDTO){
        CandidateInformation result=candidateServiceImpl.updateCandidateData(candidateDTO);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }
    @GetMapping("get/candidate/{id}")
    public ResponseEntity<CandidateInformation> getCandidateDataByAadhaar (@PathVariable Integer id){
     CandidateInformation result=candidateServiceImpl.getCandidateDataByAadhaar(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @GetMapping("get/candidate")
    public ResponseEntity<List<CandidateInformation>>  getALLCandidateData(){
        List<CandidateInformation> result=candidateServiceImpl.getALLCandidateData();
        return ResponseEntity.status(HttpStatus.OK).body(result);

    }

    @DeleteMapping("delete/candidate/{id}")
    public ResponseEntity<String>  deleteCandidateData (@PathVariable Integer id){
        String s1=candidateServiceImpl.deleteCandidateData(id);
        return ResponseEntity.status(HttpStatus.OK).body(s1);

    }


}
