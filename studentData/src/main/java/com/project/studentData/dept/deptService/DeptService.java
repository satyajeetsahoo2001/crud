package com.project.studentData.dept.deptService;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgDto.ClgDto;
import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptDto.DeptDto;

import java.util.List;

public interface DeptService {
///save
    public Dept saveDept(DeptDto dto);
    //update
    public Dept updateDept(DeptDto dto, Integer dId);
    //get
    public List<Dept> getDept();
    //delete
    public void deleteDept(Integer dId);

}
