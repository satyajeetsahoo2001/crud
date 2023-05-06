package com.aadhaarData.serviceImpl;

import com.aadhaarData.dto.CandidateDTO;
import com.aadhaarData.dto.FathersDTO;
import com.aadhaarData.dto.MothersDTO;
import com.aadhaarData.entity.CandidateInformation;
import com.aadhaarData.entity.FathersInformation;
import com.aadhaarData.entity.MothersInformation;
import com.aadhaarData.repository.CandidateRepository;
import com.aadhaarData.repository.FathersRepository;
import com.aadhaarData.repository.Mothersrepository;
import com.aadhaarData.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    CandidateRepository candidateRepository;
    @Autowired
    FathersRepository fathersRepository;
    @Autowired
    Mothersrepository mothersrepository;
    @Override
    public FathersInformation saveFatherData(FathersDTO fathersDTO) {

        FathersInformation fathersInformation=fathersRepository.findByAadhaarNumber(fathersDTO.getFatherAadhaarNumber());
     FathersInformation fathersInformation1;
        if (fathersInformation==null){
            fathersInformation1=new FathersInformation();
            MothersInformation mothersInformation=mothersrepository.findByAadhaarNumber(fathersDTO.getMotherAadhaarNumber());
            fathersInformation1.setName(fathersDTO.getFatherName());
            fathersInformation1.setAadhaarNumber(fathersDTO.getFatherAadhaarNumber());
            fathersInformation1.setMothersInformation(mothersInformation);
            fathersInformation1 =fathersRepository.save(fathersInformation1);

        }
        else {
            fathersInformation1=fathersInformation;
        }
        return fathersInformation1;
    }

    @Override
    public FathersInformation updateFatherData(FathersDTO fathersDTO) {
        Optional<FathersInformation> fathersInformation=fathersRepository.findById(fathersDTO.getFatherId());
        FathersInformation fathersInformation1=null;
        if (fathersInformation.isPresent()){
            fathersInformation1=fathersInformation.get();
            MothersInformation mothersInformation=mothersrepository.findByAadhaarNumber(fathersDTO.getMotherAadhaarNumber());
            fathersInformation1.setName(fathersDTO.getFatherName());
            fathersInformation1.setAadhaarNumber(fathersDTO.getFatherAadhaarNumber());
            fathersInformation1.setMothersInformation(mothersInformation);
            fathersInformation1 =fathersRepository.save(fathersInformation1);

        }

        return fathersInformation1;
    }

    @Override
    public FathersInformation getFatherDataByAadhaar(Integer id) {
        Optional<FathersInformation> fathersInformation=fathersRepository.findById(id);
        FathersInformation fathersInformation1=null;
        if (fathersInformation.isPresent()){
            fathersInformation1=fathersInformation.get();
        }
        return fathersInformation1;
    }

    @Override
    public List<FathersInformation> getALLFatherData() {
        return fathersRepository.findAll();

    }

    @Override
    public String deleteFatherData(Integer fatherAadhaarNumber) {
        fathersRepository.deleteById(fatherAadhaarNumber);
        return "deleted";
    }

    @Override
    public MothersInformation saveMotherData(MothersDTO mothersDTO) {
      MothersInformation mothersInformation=mothersrepository.findByAadhaarNumber(mothersDTO.getMotherAadhaarNumber());
        MothersInformation mothersInformation1=null;
        if (mothersInformation==null){
            mothersInformation1=new MothersInformation();
            mothersInformation1.setAadhaarNumber((mothersDTO.getMotherAadhaarNumber()));
            mothersInformation1.setName(mothersDTO.getMotherName());
            mothersInformation1=mothersrepository.save(mothersInformation1);

        }
        else {
            mothersInformation1=mothersInformation;
        }
        return mothersInformation1;
    }

    @Override
    public MothersInformation updateMotherData(MothersDTO mothersDTO) {
        Optional<MothersInformation> mothersInformation=mothersrepository.findById(mothersDTO.getMotherId());
        MothersInformation mothersInformation1=null;
        if (mothersInformation.isPresent()){
            mothersInformation1=mothersInformation.get();
            mothersInformation1.setName(mothersDTO.getMotherName());
            mothersInformation1.setAadhaarNumber(mothersDTO.getMotherAadhaarNumber());
            mothersInformation1 =mothersrepository.save(mothersInformation1);

        }
        return mothersInformation1;
    }

    @Override
    public MothersInformation getMotherDataByAadhaar(Integer id) {

        Optional<MothersInformation> mothersInformation=mothersrepository.findById(id);
        MothersInformation mothersInformation1=null;
        if (mothersInformation.isPresent()){
            mothersInformation1=mothersInformation.get();
        }
        return mothersInformation1;
    }

    @Override
    public List<MothersInformation> getAllMotherData() {
        return mothersrepository.findAll();
    }

    @Override
    public String deleteMotherData(Integer id) {
        mothersrepository.deleteById(id);
        return "deleted";
    }

    @Override
        public CandidateInformation saveCandidateData(CandidateDTO candidateDTO) {
        CandidateInformation candidateInformation1=new CandidateInformation();;
         FathersInformation fathersInformation=fathersRepository.findByAadhaarNumber(candidateDTO.getFatherAadhaarNumber());

            candidateInformation1.setAadhaarNumber((candidateDTO.getCandidateAadhaarNumber()));
            candidateInformation1.setName(candidateDTO.getCandidateName());
            candidateInformation1.setFathersInformation(fathersInformation);
            candidateInformation1=candidateRepository.save(candidateInformation1);



        return candidateInformation1;
    }

    @Override
    public CandidateInformation updateCandidateData(CandidateDTO candidateDTO) {
        CandidateInformation candidateInformation1=candidateRepository.findByAadhaarNumber(candidateDTO.getCandidateAadhaarNumber());
        FathersInformation fathersInformation=fathersRepository.findByAadhaarNumber(candidateDTO.getFatherAadhaarNumber());
if (candidateInformation1!=null) {
    candidateInformation1.setAadhaarNumber((candidateDTO.getCandidateAadhaarNumber()));
    candidateInformation1.setName(candidateDTO.getCandidateName());
    candidateInformation1.setFathersInformation(fathersInformation);
    candidateInformation1 = candidateRepository.save(candidateInformation1);
}


        return candidateInformation1;
    }

    @Override
    public CandidateInformation getCandidateDataByAadhaar(Integer id) {
        Optional<CandidateInformation> candidateInformation=candidateRepository.findById(id);
        CandidateInformation candidateInformation1=null;
        if (candidateInformation.isPresent()){
            candidateInformation1=candidateInformation.get();
        }
        return candidateInformation1;
    }

    @Override
    public List<CandidateInformation> getALLCandidateData() {

        return candidateRepository.findAll();
    }

    @Override
    public String deleteCandidateData(Integer candidateAadhaarNumber) {
        candidateRepository.deleteById(candidateAadhaarNumber);
        return "deleted";
    }
}
