package com.project.studentData.College.clgService;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgDto.ClgDto;

import java.util.List;

public interface ClgService {
    //save
    public Clg saveClg(ClgDto dto);
    //update
    public Clg updateClg(ClgDto dto,Integer clgId);
    //get
    public List<Clg> getClg();
    //delete
    public void deleteClg(Integer clgId);
}
