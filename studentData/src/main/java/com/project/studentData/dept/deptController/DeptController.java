package com.project.studentData.dept.deptController;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgDto.ClgDto;
import com.project.studentData.College.clgServiceImpl.ClgServiceImpl;
import com.project.studentData.dept.dept.Dept;
import com.project.studentData.dept.deptDto.DeptDto;
import com.project.studentData.dept.deptRepo.DeptRepo;
import com.project.studentData.dept.deptService.DeptService;
import com.project.studentData.dept.deptServiceImpl.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptServiceImpl impl;
@PostMapping("save")
    public ResponseEntity<Dept> saveDept(@RequestBody DeptDto dto){
        Dept result=impl.saveDept(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
@PutMapping("update/{dId}")
    public ResponseEntity<Dept> updateDept(@RequestBody DeptDto dto,@PathVariable Integer dId){

        Dept result=impl.updateDept(dto,dId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
@GetMapping("get")
    public List<Dept> getClg(){
        List<Dept> result=impl.getDept();
        return (List<Dept>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete{dId}")
    public ResponseEntity<String> deleteClg(@PathVariable Integer dId){
        impl.deleteDept(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }

}
