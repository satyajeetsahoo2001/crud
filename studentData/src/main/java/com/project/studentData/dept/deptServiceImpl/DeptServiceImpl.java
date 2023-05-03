package com.project.studentData.dept.deptServiceImpl;

import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptDto.DeptDto;
import com.project.studentData.dept.deptRepo.DeptRepo;
import com.project.studentData.dept.deptService.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptRepo repo;
    // save
    @Override
    public Dept saveDept(DeptDto dto) {
        Dept dept = new Dept();
        dept.setDName(dto.getDName());
        return repo.save(dept);
    }

    //update
    public Dept updateDept(DeptDto dto,Integer dId){
        Dept dept = repo.findById(dId).get();
        dept.setDName(dto.getDName());
        return repo.save(dept);
    }




    //get
    public List<Dept> getDept(){
        return repo.findAll();
    }
    //delete
    public void deleteDept(Integer dId){
        repo.deleteById(dId);
    }

}
