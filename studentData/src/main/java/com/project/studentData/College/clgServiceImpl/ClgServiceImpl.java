package com.project.studentData.College.clgServiceImpl;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgDto.ClgDto;
import com.project.studentData.College.clgRepo.ClgRepo;
import com.project.studentData.College.clgService.ClgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClgServiceImpl implements ClgService {
    @Autowired
    private ClgRepo clgREpo;
   // save
    public Clg saveClg(ClgDto dto) {
    Clg clg=new Clg();
    clg.setClgName(dto.getClgName());
    return clgREpo.save(clg);
    }
    //update
    public Clg updateClg(ClgDto dto,Integer clgId){
        Clg clg=clgREpo.findById(clgId).get();
        clg.setClgName(dto.getClgName());
        return clgREpo.save(clg);
    }
    //get
    public List<Clg> getClg(){
        return clgREpo.findAll();
    }
    //delete
    public void deleteClg(Integer clgId){
        clgREpo.deleteById(clgId);
    }
}

