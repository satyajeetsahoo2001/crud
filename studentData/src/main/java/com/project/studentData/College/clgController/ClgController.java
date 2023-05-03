package com.project.studentData.College.clgController;

import com.project.studentData.College.clg.Clg;
import com.project.studentData.College.clgDto.ClgDto;
import com.project.studentData.College.clgServiceImpl.ClgServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clg")

public class ClgController {

    @Autowired
    private ClgServiceImpl impl;
    @PostMapping("save")
    public ResponseEntity<Clg> saveClg(@RequestBody ClgDto dto){
        Clg result=impl.saveClg(dto);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
@PutMapping("update/{clgId}")
    public ResponseEntity<Clg> updateClg(@RequestBody ClgDto dto,@PathVariable Integer clgId){

        Clg result=impl.updateClg(dto,clgId);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

@GetMapping("get")
    public List<Clg> getClg(){
        List<Clg> result=impl.getClg();
        return (List<Clg>) ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @DeleteMapping("delete/{dId}")
    public ResponseEntity<String> deleteClg(@PathVariable Integer dId){
        impl.deleteClg(dId);
        return  ResponseEntity.status(HttpStatus.OK).body("deleted");
    }


}
